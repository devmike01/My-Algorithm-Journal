s ="{{)[](}}"


temp = [']', '}', ')']


comp = ['[', '{', '(']

  
# Function to check parentheses 
def isBalanced(myStr):
    stack = []
    st =[]
    index =0
    l = len(myStr)
    
    for m in myStr:
        if m not in temp:
            stack.append(m)
        else:
            if len(stack) <= 0:
                return False
            else:
                stack.pop()
            
        index +=1

    print(stack, "__"+str(index), st)


print(isBalanced(s))
    
