Program Bueno2;
	Var
		Num1,num2,r:integer;
		
Begin
	writeln('Ingrese Un numero');
	read(Num1);
	writeln('Ingrese Un numero');
	read(Num2);
	if (num2<>0)then
	Begin
		r:=Num1/num2;
		Writeln('El resultado es: ',r);
	End;
	If (num2=0)then
	Begin
		writeln('No se puede dividir por cero');
	End;
End