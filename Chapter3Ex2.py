import sys

if len(sys.argv) < 2:
    print("Please provide a query string as a command-line argument.")
    sys.exit(1)

query = sys.argv[1]

while True:
    try:
        line = input()
        if query in line:
            print(line)
    except EOFError:
        break