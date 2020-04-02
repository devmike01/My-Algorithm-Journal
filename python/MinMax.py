def shellsort(s, n, m):

    if m == n or s == m:
    
    l = arr[s]
    r = arr[n]

    if l < r:
        print(l)
        l = r

    s +=1
    n -=1
    
    m //= 2
    
    shellsort(s,n, m)
    return str(l) +"_"+str(r)

arr = [3, 1, 11, 2, 3, 112, 4, 5, 100]
m = len(arr)//2

shellsort(0, (len(arr)-1), m)
