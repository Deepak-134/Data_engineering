Q.) Give output for these block .
try:
   a=10
except Exception as e:
   print(a)
   raise e
  ----> Block will do nothing.

Q.) reverse string
s = "India"
print(s[::-3])

Q.) Initialize a empty set and dictonary
d = {}
s = set()
----> To make an empty set in Python, use the set() function with no arguments; if we use empty curly brackets "{}", we will get an empty dictionary

Q.) add more than one parameter as arguments. ? Can we pass list as argument and will we get result
def sum_of_int(*arg):
	print(sum(arg))

Q.) Give max and min marks key and value
demo_dict = {"ria":23, "pr":45, "akk":20}
d = {}
max = max(list(demo_dict.values()))
min = min(list(demo_dict.values()))

for i in demo_dict:
	if demo_dict[i] == max:
		print('Max marks',i,demo_dict[i])
  elif demo_dict[i] == min:
    print('Min marks',i,demo_dict[i])
		
Q.) Give output.
input_string = "aabbcccaaab" 
input_string = [i for i in input_string]
unique = []
for i in input_string:
	if i not in unique:
		unique.append(i)

for i in unique:
	print(i,' ----> ',input_string.count(i))

Q.) Give output.
q_list = ['a  ', '     n', '7 \t\t',....]
out = ['a','n','7',..]
--->
for i in q_list:
	output.append(i.strip)

Q.) Convert Roman into integer.
roman_to_int_dict = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
n = 'XXIV'
prev = 0
total = 0
for i in n:
    current = roman_to_int_dict[i]
    if current > prev:
        total = total+ current - 2*prev
    else:
        total = total+current
    prev = current

print(total)
