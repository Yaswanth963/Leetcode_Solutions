We traverse each row add add each element along with its row number as string. If we got the same number in the same row we return false. Similarly we add element along with its col value. We add box value along with its row and col. In box row and col indicates box number in the grid.
​
​
( i,j ) ->  ( 2,3 ) -> (2/3,3/3) -> (0,1)
-> ( 5,2 ) -> (5/3,2/3) -> (1,0)
-> (6,8)  -> (6/3,8/3)  -> (2,2)
Here the final result indicates box value acros the grid. (2,2)-> rowwise third box and col wise third box. In this way we can keep track of the repeated values in same box.