program repaso3;
Type
	venta = record
		cod : integer;
		tipo : integer;
		fecha : String[8];
		vendidas : integer;
		monto : real;
	end;

  arbol= ^nodoA;
  nodoA = Record
    dato: venta;
    HI: arbol;
    HD: arbol;
  End;
  
procedure Insertar(var a: arbol; dato: venta);
begin
 if (a = nil) then begin
	new(a);
	a^.dato:= dato;
	a^.HI:= nil;
	a^.HD:= nil;
 end
 else
 if (a^.dato.cod > dato.cod) then
	Insertar(a^.HI, dato)
 else if (a^.dato.cod < dato.cod) then
	Insertar (a^.HD, dato);
end;
  
procedure ingresarDatos(var a: arbol);
var v: venta;
begin
	v.vendidas := -1;
	while (v.vendidas <> 0) do begin
		write('Codigo de producto: ');
		readln(v.cod);
		write('Tipo de producto: ');
		readln(v.tipo);	
		write('Fecha: ');
		readln(v.fecha);	
		write('Unidades vendidas: ');
		readln(v.vendidas);	
		if (v. vendidas <> 0) then begin
			write('Monto de la venta: ');
			readln(v.monto);
			Insertar(a, v);
		end;
		writeln();
	end;
end;

procedure informar1(a : arbol);
begin
	if a <> nil then begin
		if (a^.dato.cod > 1499) then informar1(a^.HI);
		if (a^.dato.cod > 1500) and (a^.dato.cod < 2200) then writeln('Cod ', a^.dato.cod, ' Tipo: ', a^.dato.tipo);
		if (a^.dato.cod < 2201) then informar1(a^.HD);
	end;
end;

function informar2(a: arbol): integer;
var c: integer;
begin
	if a <> nil then begin
		c:= informar2(a^.HI);
		if (a^.dato.monto > 10000) and (a^.dato.monto < 50000) then c:= c + 1;
		c:= c + informar2(a^.HD);
	end
	else c:= 0;
	informar2:= c;
end;

var a : arbol;
BEGIN
	a := nil;
	ingresarDatos(a);
	informar1(a);
	writeln();
	writeln('Productos vendidos en el rango (10000 - 50000): ', informar2(a));
	
END.

