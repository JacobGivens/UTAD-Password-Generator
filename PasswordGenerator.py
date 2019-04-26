currentInput = ""
import random
def manage():
    currentInput = input("Enter=Continue, Continue to generate or enter value and continue to terminate.")
    if currentInput == "":
        return True
    else:
        return False

characterList = []
specials = ['!', '"', '$', '%', ',', '(', ')', '*', '+', '-', '.', '/', ';', ':',
    '=', '>', '?', '^', '_', '{', '|', '}', '~', '\\', '[', ']']
characterList = [i for i in specials]
for i in range(0,26):
    characterList.append(chr(65+i))

for i in range(0,26):
    characterList.append(chr(97+i))

for i in range(0,10):
    characterList.append(str(i))

#for i in characterList:
#    print(i)

while manage():
    word = ""
    for i in range(0,15):
        word = characterList[random.randint(0,len(characterList)-1)] + word
    print(word)
