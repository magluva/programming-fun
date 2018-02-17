>```
>   ___ ___               .__              _________ .__                   __
>  /   |   \_____    _____|  |__           \_   ___ \|  |__   ____   ____ |  | __ ___________
>/    ~    \__  \  /  ___/  |  \   ______ /    \  \/|  |  \_/ __ \_/ ___\|  |/ // __ \_  __/ 
>\    Y    // __ \_\___ \|   Y  \ /_____/ \     \___|   Y  \  ___/\  \___|    <\  ___/|  | 
>  \___|_  /(____  /____  >___|  /          \______  /___|  /\___  >\___  >__|_ \\___  >__|
>        \/      \/     \/     \/                  \/     \/     \/     \/     \/    \/
>          Using certUtil/PowerShell
>```

## OVERVIEW

This script asks for user input of the algorithm (SHA1, SHA256, MD5, etc.), the thumbprint listed the 
on download/dev page and the path to the downloaded program (C:\\Users\User\Downloads\file.exe, etc.).

These inputs gets stored to variables which are then used to call the relevant powerShell/certUtil commands.
The outputs of these commands are stored as strings which are then compared to the content of the thumbprint 
variable provided by the user.

Final output is:
Keys are an exact match ... || WARNING: Keys do not match! 


## PYTHON SCRIPT

The python script requires python 3.xx and powerShell installed on your computer.
To run: open cmd or custom python environment and run python hash_checker.py and follow instructions.

Notes:
- When asked to provide the path to .exe file, the adress needs to be given with double backslashes as separators,
  like this: C:\\Users\\User\\Folder\\file.exe
- If you get "command not recognized", check your PATH
 

## CMD FILE

This is a batch-like cmd script that uses certUtil as the mechanism to calculate hash sum and compare.
The program will work with !out of the box" windows and older versions without the need to install any third party
software. This is because certUtils has shipped with windows for some time.
To run: Simply double click the batch file from anywhere.

Notes:
- The path to .exe does not need double backslashes, 
  like this: C:\\Users\User\Folder\file.exe
- If you get "command not recognized", check your PATH


## TODO
Will at C program using OpenSSL for Linux in the future.
