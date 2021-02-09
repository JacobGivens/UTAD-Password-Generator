currentInput = ""
import random
import collections

def manage():
	currentInput = input("Enter=Continue, Continue to generate or enter value and continue to terminate.")
	if currentInput == "":
		return True
	else:
		return False

caps = [chr(65+x) for x in range(26)]
lows = [chr(97+x) for x in range(26)]
nums = [str(x) for x in range(10)]
specials = ['!', '"', '$', '%', ',', '(', ')', '*', '+', '-', '.', '/', ';', ':',
	'=', '>', '?', '^', '_', '{', '|', '}', '~', '\\', '[', ']']
characterList = specials + caps + lows + nums
#for i in characterList:
#	print(i)

while manage():
	while True:
		word = ""
		for i in range(0,15):
			word = characterList[random.randint(0,len(characterList)-1)] + word
		s=max(collections.Counter(word).values())
		c = any([ x in caps for x in word ])
		l = any([ x in lows for x in word ])
		n = any([ x in nums for x in word ])
		p = any([ x in specials for x in word ])
		if (s < 3 and all([c,l,n,p])):
			break
	print(s,i)
	print(word)
