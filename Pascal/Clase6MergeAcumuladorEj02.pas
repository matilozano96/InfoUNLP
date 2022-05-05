program MergeAcEj02;

CONST
     DIM = 10;
     
TYPE
	ventaTot = record
		producto: integer;
		cantidad: integer;
    end;
	lista2 = ^nodo2;
    nodo2 = record
		dato: ventaTot;
        sig: lista2;
	end;

	venta = record
		codV: integer;
		producto: integer;
		cantidad: integer;
    end;
	lista = ^nodo;
    nodo = record
		dato: venta;
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
             writeln('	Venta ', v[i]^.dato.codV, ': ID ', v[i]^.dato.producto , ' - ', v[i]^.dato.cantidad, ' unidades.');
             v[i]:= v[i]^.sig;
         end;
         writeln();
     end;
end;

{----------------GEN VECTOR-------------------}

procedure agregarOrdenado (var l: lista; v: venta);
var nuevo, temp, prev: lista;
begin
    new(nuevo);
    nuevo^.dato := v;
    temp:= l;
    prev:= l;
    if (l = nil) then l:= nuevo
    else begin
        while (temp <> nil) and (temp^.dato.producto < v.producto) do begin
			prev:= temp;
			temp:= temp^.sig;
		end;
		nuevo^.sig:= temp;
		if temp=l then l:= nuevo
		else prev^.sig := nuevo;
    end;
end;

procedure GenerarLista(var l: lista);
var v: venta;
begin
    l:= nil;
    v.codV:= random(10);
    while (v.codV > 0) do begin
		v.cantidad:= random(15) + 1;
		v.producto:= random(19) + 1;
		AgregarOrdenado(l, v);
		v.codV:= random(10);
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

procedure agregarAtras (d: ventaTot; var l, ult: lista2);
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
		if (v[i] <> nil) then if (v[i]^.dato.producto < min) then begin
			min:= v[i]^.dato.producto;
			minIndex:= i;
		end;
	end;
end;

procedure MergeAc(listas: vector; var nuevo: lista2);
var
    ult: lista2;
	minIndex: integer;
	acumulado: ventaTot;
begin
    ult:= nil;
	minimo(listas, minIndex);
	while (minIndex <> -1) do begin
		acumulado.producto:= listas[minIndex]^.dato.producto;
		acumulado.cantidad:= 0;
		while (minIndex <> -1) and (acumulado.producto = listas[minIndex]^.dato.producto) do begin
			acumulado.cantidad:= acumulado.cantidad + listas[minIndex]^.dato.cantidad;
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
		writeln('	ID ', l^.dato.producto, ': ', l^.dato.cantidad, ' unidades.');
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
