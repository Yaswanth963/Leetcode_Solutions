Initially we can place our fingers at any position. So we start placing our two fingers at different positions and so recursive calls to obtain minimum.
​
For each character we can find its row and col number by using val/6, val%6. For each call we either reach current character from finger1 or from finger2. We get the results of both and store the minimum.