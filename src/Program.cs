using System;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System.IO;

class Program
{
    static void Main(string[] args)
    {
        if(args.Length < 1) {
            throw new ArgumentException("Needs file name as argument");
        }

        using(FileStream fs = File.OpenRead(args[0])){
            AntlrInputStream imputStream = new AntlrInputStream(fs);
            JavaScriptLexer lexer = new JavaScriptLexer(imputStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            JavaScriptParser parser = new JavaScriptParser(commonTokenStream);
            parser.BuildParseTree = true;
            JavaScriptParser.ParseContext context = parser.parse();

            JavaScriptListner listner = new JavaScriptListner();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.Walk(listner, context);
        }
    }
}
