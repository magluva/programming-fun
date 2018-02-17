# -*- coding: utf-8 -*-
"""
Created on Fri Feb 16 13:12:05 2018

@author: Magnus
"""

import sys
from subprocess import check_output
import re
import argparse

def read_args():
    parser = argparse.ArgumentParser()
    parser.add_argument("-v", "--verbose", help="increase output verbosity",
                    action="store_true")
    args = parser.parse_args()
    return args


def exec_cmd(path, algorithm):
    data_bytes = check_output("powershell Get-FileHash {} -Algorithm {}"\
                              .format(path, algorithm), shell=True)
    data_str = data_bytes.decode()
    return data_str.split()
    
def get_key(data, input_key):
    key_length = len(input_key)
    regex = re.compile('[A-Za-z0-9]{{{}}}'.format(key_length))
    for entry in data:
        res = regex.match(entry)
        if res is not None:
            break
    if res is None:
        print(error_msg())
        sys.exit(0)
    exe_key = res.group(0)
    return exe_key

def check_equal(input_key, exe_key):
    if input_key.upper() == exe_key.upper():
        return True
    return False
    
def error_msg():
    msg = ("""
            NoneType Error!"
            ----------------------------------------------------
            No key matching the length and ascii composition
            of the input key was found during lookup.
            ----------------------------------------------------
            Please check input key and algorithm type...
            """)
    return msg

def success_msg(boolean):
    if boolean:
        return "Valid key found: Keys are an exact match."
    return "WARNING: Key found does not match provided key!"


if __name__ == "__main__":
    
    print("  ___ ___               .__              _________ .__                   __\n" +\
          " /   |   \_____    _____|  |__           \_   ___ \|  |__   ____   ____ |  | __ ___________\n" +\
          "/    ~    \__  \  /  ___/  |  \   ______ /    \  \/|  |  \_/ __ \_/ ___\|  |/ // __ \_  __ \ \n" +\
          "\    Y    // __ \_\___ \|   Y  \ /_____/ \     \___|   Y  \  ___/\  \___|    <\  ___/|  | \/\n" +\
          " \___|_  /(____  /____  >___|  /          \______  /___|  /\___  >\___  >__|_ \\___  >__|\n" +\
          "       \/      \/     \/     \/                  \/     \/     \/     \/     \/    \/\n" + \
          "\nUsing PowerShell ")
   
    args = read_args()
    
    if args.verbose:
        print("verbose on")
    
    print("\n----------------------------------------------------------------------------------------------")
    input_key = input("Please paste the provided thumbprint here:\n\n")
    
    if args.verbose:
        print("\nVERBOSE: Stored key '{}' to var ...".format(input_key))
    
    print("----------------------------------------------------------------------------------------------")
    path = input("Provide the path to the .exe file with double backslashes as separators:\n" +\
                 r"(example: C:\\Users\\User\\Download\\file_to_check.exe)" + "\n\n")
    
    if args.verbose:
        print("\nVERBOSE: Stored path '{}' to var ...".format(path))
    
    print("----------------------------------------------------------------------------------------------")
    algorithm = input("Lastly, provide the algorithm to use.\n(example: SHA1)\n\n")
    
    if args.verbose:
        print("\nVERBOSE: Stored algorithm '{}' to var ...".format(algorithm))
    
    exe_key = get_key(exec_cmd(path, algorithm), input_key)
    _res = check_equal(input_key, exe_key)
    
    if args.verbose:
        print("\nVERBOSE: Checking if strings are equal ...")
    
    res = success_msg(_res)
    
    print("----------------------------------------------------------------------------------------------")
    print("Result:\n{}".format(res))
