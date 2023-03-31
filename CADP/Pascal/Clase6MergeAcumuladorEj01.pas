program MergeAcEj01;

CONST
     DIM = 4;
     
TYPE
	gastoTot = record
		tipo: integer;
		monto: real;
    end;
	lista2 = ^nodo2;
    nodo2 = record
		dato: gastoTot;
        sig: lista2;
	end;

	gasto = record
		tipo: integer;
		monto: real;
    end;
	lista = ^nodo;
    nodo = record
		dato: gasto;
        sig: lista;
	end;
    vector = array [1..DIM] of lista;
    
{----------------PRINT VECTOR-------------------}

procedure ImprimirVectorListas(v:vector);
var i: integer;
begin
     for i:= 1 to DIM do begin
         writeln('Lista ', i, ': ');
         if (v[i] = nil) then writeln('VACIA');
         while (v[i] <> nil) do begin
             writeln('		', v[i]^.dato.tipo, ': ', v[i]^.dato.monto:2:2);
             v[i]:= v[i]^.sig;
         end;
         writeln();
     end;
end;

{----------------GEN VECTOR-------------------}

procedure agregarOrdenado (var l: lista; g: gasto);
var nuevo, temp, prev: lista;
begin
    new(nuevo);
    nuevo^.dato := g;
    temp:= l;
    prev:= l;
    if (l = nil) then l:= nuevo
    else begin
        while (temp <> nil) and (temp^.dato.tipo < g.tipo) do begin
			prev:= temp;
			temp:= temp^.sig;
		end;
		nuevo^.sig:= temp;
		if temp=l then l:= nuevo
		else prev^.sig := nuevo;
    end;
end;

procedure GenerarLista(var l: lista);
var g: gasto;
begin
    l:= nil;
    g.tipo:= random(6);
    while (g.tipo > 0) do begin
		g.monto:= random(10)*100;
		AgregarOrdenado(l, g);
		g.tipo:= random(6);
    end;
end;

procedure CrearVectorListas (var v: vector);
var i: integer;
begin
    for i:=1 to DIM do begin
		GenerarLista(v[i]);
	end;
end;

{----------------MERGE ACUMULADOR-------------------}

procedure agregarAtras (d: gastoTot; var l, ult: lista2);
	var nuevo: lista2;
    begin
		new(nuevo);
		nuevo^.dato:= d;
        if (l = nil) then begin
            l:= nuevo;
            ult:= l;
        end
        else begin 
            ult^.sig:= nuevo;
            ult:= ult^.sig;
        end;
    end;

procedure minimo (var v: vector; var minIndex: integer);
var i: integer;
    min: integer;
begin
     minIndex:= -1;
     min:= 999;
     for i:= 1 to DIM do begin
		if (v[i] <> nil) then if (v[i]^.dato.tipo < min) then begin
			min:= v[i]^.dato.tipo;
			minIndex:= i;
		end;
	end;
end;

procedure MergeAc(listas: vector; var nuevo: lista2);
var
    ult: lista2;
	minIndex: integer;
	acumulado: gastoTot;
begin
    ult:= nil;
	minimo(listas, minIndex);
	while (minIndex <> -1) do begin
		acumulado.tipo:= listas[minIndex]^.dato.tipo;
		acumulado.monto:= 0;
		while (minIndex <> -1) and (acumulado.tipo = listas[minIndex]^.dato.tipo) do begin
			acumulado.monto:= acumulado.monto + listas[minIndex]^.dato.monto;
			listas[minIndex]:= listas[minIndex]^.sig;
			minimo(listas, minIndex);
		end;
		agregarAtras (acumulado, nuevo, ult);
	end;
end;

{----------------PRINT FINAL-------------------}
procedure ImprimirLista (l: lista2);
begin
	writeln('LISTA FINAL: ');
	while (l <> nil) do begin
		writeln('		', l^.dato.tipo, ': ', l^.dato.monto:2:2);
		l:= l^.sig;
	end;
end;



var
	v: vector;
	listaFinal: lista2;
BEGIN
	randomize;
	CrearVectorListas(v);
	ImprimirVectorListas(v);
	MergeAc(v, listaFinal);
	ImprimirLista(listaFinal);
END.

