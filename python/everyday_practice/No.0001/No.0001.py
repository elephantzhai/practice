import string,random

def rand_str(num,length = 7):
	f = open("activation_code.txt","wb")
	chars = string.letters+string.digits
	for i in range(num):
		s = [random.choice(chars) for j in range(length)]
		f.write(''.join(s)+'\n')
	f.close()

if __name__ == '__main__':
	rand_str(200)
