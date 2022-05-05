program merge2;
CONST
     DIM = 4;
TYPE
	lista = ^nodo;
        nodo = record
            dato : integer;
            sig : lista;
        end;
    vector = array [1..DIM] of lista;

{ MERGE que reorganiza los elementos de las listas. Las listas originales se pierden. }
// Retorna el indice con el menor valor. No modifica las listas
procedure minimo (var v: vector; var minIndex: integer);
var i: integer;
    min: integer;
begin
     minIndex:= -1;
     min:= 999;
     for i:= 1 to DIM do begin
		if (v[i] <> nil) then if (v[i]^.dato < min) then begin
			min:= v[i]^.dato;
			minIndex:= i;
		end;
	end;
end;

//  Agregar atras con puntero al ultimo elemento, avanza las listas del vector
procedure agregarAtras (index: integer; var l, ult: lista; var v: vector);
    begin
        if (l = nil) then begin
            l:= v[index];
            ult:= l;
        end
        else begin 
            ult^.sig:= v[index];
            ult:= ult^.sig;
        end;
        v[index]:= v[index]^.sig;
    end;

procedure merge (var listas: vector; var nuevo: lista);
var
    ult: lista;
	minIndex: integer;
begin
    ult:= nil;
	minimo(listas, minIndex);
	while (minIndex <> -1) do begin
		agregarAtras (minIndex, nuevo, ult, listas);
		minimo(listas, minIndex);
	end;
end;

{--------------------------------------------------------------}

procedure ImprimirLista(l: lista);
begin
    write('Lista merge: ');
    if (l = nil) then writeln('VACIA');
    while (l <> nil) do begin
         write(l^.dato, ' - ');
         l:= l^.sig;
    end;
    writeln();
end;

procedure agregarOrdenado (var l: lista; num: integer);
var nuevo, temp, prev: lista;
begin
    new(nuevo);
    nuevo^.dato := num;
    temp:= l;
    prev:= l;
    if (l = nil) then l:= nuevo
    else begin
        while (temp <> nil) and (temp^.dato < num) do begin
			prev:= temp;
			temp:= temp^.sig;
		end;
		nuevo^.sig:= temp;
		if temp=l then l:= nuevo
		else prev^.sig := nuevo;
    end;
end;

procedure GenerarLista(var l: lista);
var num: integer;
begin
       l:= nil;
       num:= random(12);
       writeln(num);
       while (num > 0) do begin
           AgregarOrdenado(l, num);
           num:= random(20);
           writeln(num);
       end;
end;

procedure CrearVectorListas (var v: vector);
var i: integer;
begin
    for i:=1 to DIM do begin
		writeln('Lista ', i, ': ');
		GenerarLista(v[i]);
	end;
end;

procedure ImprimirVectorListas(v:vector);
var i: integer;
begin
     for i:= 1 to DIM do begin
         write('Lista ', i, ': ');
         if (v[i] = nil) then writeln('VACIA');
         while (v[i] <> nil) do begin
             write(v[i]^.dato, ' - ');
             v[i]:= v[i]^.sig;
         end;
         writeln();
     end;
end;


var v: vector;
    nuevaL: lista;
    num: integer;

BEGIN
	randomize;
     nuevaL:= nil;
     writeln('Generando vector...');
     CrearVectorListas(v);
     ImprimirVectorListas(v);
     ImprimirLista(nuevaL);

     merge(v, nuevaL);
     ImprimirVectorListas(v);
     ImprimirLista(nuevaL);

     readln(num);
END.
