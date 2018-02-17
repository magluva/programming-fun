@echo off
SETLOCAL ENABLEEXTENSIONS ENABLEDELAYEDEXPANSION
title HashChecker

type logo.txt
::  ___ ___               .__              _________ .__                   __
:: /   |   \_____    _____|  |__           \_   ___ \|  |__   ____   ____ |  | __ ___________
::/    ~    \__  \  /  ___/  |  \   ______ /    \  \/|  |  \_/ __ \_/ ___\|  |/ // __ \_  __/ 
::\    Y    // __ \_\___ \|   Y  \ /_____/ \     \___|   Y  \  ___/\  \___|    <\  ___/|  | 
:: \___|_  /(____  /____  >___|  /          \______  /___|  /\___  >\___  >__|_ \\___  >__|
::       \/      \/     \/     \/                  \/     \/     \/     \/     \/    \/
::          Using certUtil
echo.
echo.-------------------------------------------------------------------------------------
echo.Please enter the algorithm to use:
echo.
set /P algorithm=
:echo %algorithm%
echo.-------------------------------------------------------------------------------------
echo.Please enter the provided thumbprint:
echo.
set /P inputkey=
echo.
echo.-------------------------------------------------------------------------------------
echo.Please enter the path to the exe you want to verify:
echo.
set /P exepath=
echo.
echo.-------------------------------------------------------------------------------------
echo.
echo.Calculating key using %algorithm% algorithm ...

set count=1
for /F "tokens=* USEBACKQ" %%F in (`certUtil -hashfile "%exepath%" "%algorithm%"`) do (
  set var!count!=%%F
  set /a count=!count!+1
)

echo.
echo.-------------------------------------------------------------------------------------
echo.Result:
echo.
echo.Provided key:   %inputkey%
echo.Calculated key: %var2%
echo.

if "!inputkey!" == "!var2!" (
	echo.The keys are en exact match ...
) else (
	echo.WARNING: The keys do NOT match!
)

echo.
ENDLOCAL
pause
