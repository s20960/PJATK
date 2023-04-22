@echo off
echo JDK HOME PATH Setter by Knopers
set KEY="HKLM\SOFTWARE\JavaSoft\Java Development Kit\1.8"
set VALUE=JavaHome
reg query %KEY% /v %VALUE% 2>nul || (
    echo JavaHome not installed
    exit /b 1
)

set JDK_HOME=
for /f "tokens=2,*" %%a in ('reg query %KEY% /v %VALUE% ^| findstr %VALUE%') do (
    set JDK_HOME=%%b
)

setx JDK_HOME "%JDK_HOME%"
setx PATH "%JDK_HOME%\bin"
echo JDK Home: %JDK_HOME% added to Path
