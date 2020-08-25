.assembly extern mscorlib {}
.assembly Debug {}
.module Debug.exe

.class Debug.Program
extends [mscorlib]System.Object
{
 .method static void Main(string[] args)
 cil managed
 {
  .entrypoint

ldstr "tekst 123\""
call void [mscorlib]System.Console::WriteLine(string)

ldstr "tekst 456"
call void [mscorlib]System.Console::WriteLine(string)

ldc.i4 10
call void [mscorlib]System.Console::WriteLine(int32)

ldc.r4 10.4
call void [mscorlib]System.Console::WriteLine(float32)

ldc.i4.1
call void [mscorlib]System.Console::WriteLine(bool)

ldstr "tekst 1"
.locals init(string v_v1)
stloc v_v1
// v1 = tekst 1

ldstr "tekst 2"
.locals init(string v_v2)
stloc v_v2
// v2 = tekst 2

ldc.i4 20
.locals init(int32 v_v3)
stloc v_v3
// v3 = 20

ldc.r4 20.6
.locals init(float32 v_v4)
stloc v_v4
// v4 = 20.6

ldc.i4.0
.locals init(bool v_v5)
stloc v_v5
// v5 = 0

ldloc v_v1
call void [mscorlib]System.Console::WriteLine(string)

ldloc v_v2
call void [mscorlib]System.Console::WriteLine(string)

ldloc v_v3
call void [mscorlib]System.Console::WriteLine(int32)

ldloc v_v4
call void [mscorlib]System.Console::WriteLine(float32)

ldloc v_v5
call void [mscorlib]System.Console::WriteLine(bool)

ldc.i4 10
ldc.i4 1
add
.locals init(int32 v_tmp_0)
stloc v_tmp_0
// tmp_0 = 10 + 1

ldloc v_tmp_0
call void [mscorlib]System.Console::WriteLine(int32)

ldloc v_v3
ldc.i4 13
add
.locals init(int32 v_tmp_1)
stloc v_tmp_1
// tmp_1 = v3 + 13

ldloc v_tmp_1
call void [mscorlib]System.Console::WriteLine(int32)

  ret
 }
}
