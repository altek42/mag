
// Metadata version: v4.0.30319
.assembly extern System.Runtime
{
  .publickeytoken = (B0 3F 5F 7F 11 D5 0A 3A )                         // .?_....:
  .ver 4:2:2:0
}
.assembly extern System.Console
{
  .publickeytoken = (B0 3F 5F 7F 11 D5 0A 3A )                         // .?_....:
  .ver 4:1:2:0
}
.assembly dotnet
{
  .custom instance void [System.Runtime]System.Runtime.CompilerServices.CompilationRelaxationsAttribute::.ctor(int32) = ( 01 00 08 00 00 00 00 00 ) 
  .custom instance void [System.Runtime]System.Runtime.CompilerServices.RuntimeCompatibilityAttribute::.ctor() = ( 01 00 01 00 54 02 16 57 72 61 70 4E 6F 6E 45 78   // ....T..WrapNonEx
                                                                                                                   63 65 70 74 69 6F 6E 54 68 72 6F 77 73 01 )       // ceptionThrows.
  .custom instance void [System.Runtime]System.Diagnostics.DebuggableAttribute::.ctor([System.Runtime]System.Diagnostics.DebuggableAttribute/DebuggingModes) = ( 01 00 07 01 00 00 00 00 ) 
  .custom instance void [System.Runtime]System.Runtime.Versioning.TargetFrameworkAttribute::.ctor(string) = ( 01 00 18 2E 4E 45 54 43 6F 72 65 41 70 70 2C 56   // ....NETCoreApp,V
                                                                                                              65 72 73 69 6F 6E 3D 76 33 2E 31 01 00 54 0E 14   // ersion=v3.1..T..
                                                                                                              46 72 61 6D 65 77 6F 72 6B 44 69 73 70 6C 61 79   // FrameworkDisplay
                                                                                                              4E 61 6D 65 00 )                                  // Name.
  .custom instance void [System.Runtime]System.Reflection.AssemblyCompanyAttribute::.ctor(string) = ( 01 00 06 64 6F 74 6E 65 74 00 00 )                // ...dotnet..
  .custom instance void [System.Runtime]System.Reflection.AssemblyConfigurationAttribute::.ctor(string) = ( 01 00 05 44 65 62 75 67 00 00 )                   // ...Debug..
  .custom instance void [System.Runtime]System.Reflection.AssemblyFileVersionAttribute::.ctor(string) = ( 01 00 07 31 2E 30 2E 30 2E 30 00 00 )             // ...1.0.0.0..
  .custom instance void [System.Runtime]System.Reflection.AssemblyInformationalVersionAttribute::.ctor(string) = ( 01 00 05 31 2E 30 2E 30 00 00 )                   // ...1.0.0..
  .custom instance void [System.Runtime]System.Reflection.AssemblyProductAttribute::.ctor(string) = ( 01 00 06 64 6F 74 6E 65 74 00 00 )                // ...dotnet..
  .custom instance void [System.Runtime]System.Reflection.AssemblyTitleAttribute::.ctor(string) = ( 01 00 06 64 6F 74 6E 65 74 00 00 )                // ...dotnet..
  .hash algorithm 0x00008004
  .ver 1:0:0:0
}
.module dotnet.dll
// MVID: {6D1D6A01-4F72-404D-B1B3-25A892D5DAFC}
.imagebase 0x00400000
.file alignment 0x00000200
.stackreserve 0x00100000
.subsystem 0x0003       // WINDOWS_CUI
.corflags 0x00000001    //  ILONLY


// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit dotnet.Program
       extends [System.Runtime]System.Object
{
  .method private hidebysig static void  Main(string[] args) cil managed
  {
    .entrypoint
    // Code size       132 (0x84)
    .maxstack  2
    .locals init (string V_0,
             string V_1,
             int32 V_2,
             float32 V_3,
             bool V_4)
    IL_0000:  nop
    IL_0001:  ldstr      "tekst 123\""
    IL_0006:  call       void [System.Console]System.Console::WriteLine(string)
    IL_000b:  nop
    IL_000c:  ldstr      "tekst 456"
    IL_0011:  call       void [System.Console]System.Console::WriteLine(string)
    IL_0016:  nop
    IL_0017:  ldc.i4.s   10
    IL_0019:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_001e:  nop
    IL_001f:  ldc.r8     10.4
    IL_0028:  call       void [System.Console]System.Console::WriteLine(float64)
    IL_002d:  nop
    IL_002e:  ldc.i4.1
    IL_002f:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_0034:  nop
    IL_0035:  ldstr      "tekst 1"
    IL_003a:  stloc.0
    IL_003b:  ldstr      "tekst 2"
    IL_0040:  stloc.1
    IL_0041:  ldc.i4.s   20
    IL_0043:  stloc.2
    IL_0044:  ldc.r4     20.6
    IL_0049:  stloc.3
    IL_004a:  ldc.i4.0
    IL_004b:  stloc.s    V_4
    IL_004d:  ldloc.0
    IL_004e:  call       void [System.Console]System.Console::WriteLine(string)
    IL_0053:  nop
    IL_0054:  ldloc.1
    IL_0055:  call       void [System.Console]System.Console::WriteLine(string)
    IL_005a:  nop
    IL_005b:  ldloc.2
    IL_005c:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0061:  nop
    IL_0062:  ldloc.3
    IL_0063:  call       void [System.Console]System.Console::WriteLine(float32)
    IL_0068:  nop
    IL_0069:  ldloc.s    V_4
    IL_006b:  call       void [System.Console]System.Console::WriteLine(bool)
    IL_0070:  nop
    IL_0071:  ldc.i4.s   11
    IL_0073:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0078:  nop
    IL_0079:  ldloc.2
    IL_007a:  ldc.i4.s   13
    IL_007c:  add
    IL_007d:  call       void [System.Console]System.Console::WriteLine(int32)
    IL_0082:  nop
    IL_0083:  ret
  } // end of method Program::Main

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [System.Runtime]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Program::.ctor

} // end of class dotnet.Program


// =============================================================

// *********** DISASSEMBLY COMPLETE ***********************
