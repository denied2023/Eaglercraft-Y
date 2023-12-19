@echo off
title CompileLatestClient
java -cp "buildtools/BuildTools.jar" net.LuisFierroSoria.XojangCraft.v1_8.buildtools.gui.CompileLatestClientGUI
del /S /Q "##TEAVM.TMP##\*"
rmdir /S /Q "##TEAVM.TMP##"
pause
