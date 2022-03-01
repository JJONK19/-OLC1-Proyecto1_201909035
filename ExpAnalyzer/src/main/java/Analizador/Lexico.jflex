package Analizador;
import java_cup.runtime.Symbol;
import Aplicacion.Errores;
import java.util.ArrayList;

%%
%{
    public ArrayList<Errores> a = new ArrayList<>();
%}

%public
%class Lexico
%cup
%char
%column
%full
%ignorecase
%line
%unicode

digito =  [0-9]
letra = [A-Za-z]
simbolos = [!-$]|[&-)]|\/|-|[<->]|@|[\[-\`]
mullinea = \<\!([^"!>"]|[\r|\f|\s|\t|\n])*\!\>
comlinea = \/\/.*
strings = \"(\!|[\#-\»]|\s)*\"
flecha = -(\s)*>
id = {letra}({letra}|{letra}|{digito}|_)+
especial  =  \\n|\\\"|\\\'
espacio = [\r|\f|\s|\t|\n]

%%

"%"     { return new Symbol(sym.porcentaje, yyline, yycolumn, yytext()); }
"CONJ"     { return new Symbol(sym.conjunto, yyline, yycolumn, yytext());}
"."     { return new Symbol(sym.concatenacion, yyline, yycolumn, yytext());}
"|"     { return new Symbol(sym.or, yyline, yycolumn, yytext());}
"*"     { return new Symbol(sym.kleene, yyline, yycolumn, yytext());}
"+"     { return new Symbol(sym.positiva, yyline, yycolumn, yytext());}
"?"     { return new Symbol(sym.cerouno, yyline, yycolumn, yytext());}
"~"     { return new Symbol(sym.guion, yyline, yycolumn, yytext());}
"{"     { return new Symbol(sym.apertura, yyline, yycolumn, yytext());}
"}"     { return new Symbol(sym.cierre, yyline, yycolumn, yytext());}
","     { return new Symbol(sym.coma, yyline, yycolumn, yytext());}
":"     { return new Symbol(sym.dospuntos, yyline, yycolumn, yytext());}
";"     { return new Symbol(sym.puntocoma, yyline, yycolumn, yytext());}
{espacio}   { }
{mullinea}  { }
{comlinea}  { }
{strings}   { return new Symbol(sym.cadena, yyline, yycolumn, yytext());}
{digito}   { return new Symbol(sym.digito, yyline, yycolumn, yytext());}
{letra}   { return new Symbol(sym.letra, yyline, yycolumn, yytext());}
{simbolos}   { return new Symbol(sym.simbolo, yyline, yycolumn, yytext());}
{flecha}   { return new Symbol(sym.flecha, yyline, yycolumn, yytext());}
{id}   { return new Symbol(sym.id, yyline, yycolumn, yytext());}
{especial}   { return new Symbol(sym.especial, yyline, yycolumn, yytext());}

. {
    System.out.println("Este es un error léxico: "+yytext() + "en línea"+yyline+" y columna "+yycolumn);
    Errores crear = new Errores("Léxico", yytext(), yyline, yycolumn);
    a.add(crear);
}

