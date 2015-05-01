# -*- coding: utf-8 -*-
from PIL import Image , ImageDraw ,ImageFont
import os
def add_num(picPath,num):
	img = Image.open(picPath)
	x,y = img.size
	FONT_PATH = os.environ.get("FONT_PATH", "/Library/Fonts/Times New Roman.ttf")
	myfont = ImageFont.truetype(FONT_PATH,x/3)
	ImageDraw.Draw(img).text((2*x/3,0),str(num),font = myfont,fill = 'red')
	img.save('pic_with_num.jpg')

if __name__ == '__main__':
	add_num('pic.jpg',9)