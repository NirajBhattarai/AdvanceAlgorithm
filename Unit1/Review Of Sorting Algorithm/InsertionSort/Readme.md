## Insertion Sort

Insertion Sort is a simple and efficient comparison sort algorithm that works by building a sorted list one element at a time. It's similar to how you sort playing cards in your hands.

Here's a simplified explanation:

Start from the second element (assume the first element is the initial sorted section).
Compare this element with the elements before it.
If the element is smaller than the elements before it, shift those elements to the right.
Continue shifting until you find the correct spot for the element.
Insert the element in its correct position.
Move to the next element and repeat the process until the entire list is sorted.
Let's say we have the following array of numbers that we want to sort in ascending order: [8, 5, 3, 9, 1]

An example of how Insertion Sort works:

1. [8, 5, 3, 9, 1] –> (5 is selected. Since 5 is less than 8, move 8 to the right and insert 5 before 8)
2. [5, 8, 3, 9, 1] –> (3 is selected. Since 3 is less than 8 and 5, move 8 and 5 to the right and insert 3 at the beginning)
3. [3, 5, 8, 9, 1] –> (9 is selected. Since 9 is greater than 8, it remains at its place)
4. [3, 5, 8, 9, 1] –> (1 is selected. Since 1 is less than 9, 8, 5 and 3, move these to the right and insert 1 at the beginning)
5. [1, 3, 5, 8, 9] –> (now the array is sorted)
Pseudocode for Insertion Sort:

pseudocode
```
function insertionSort(A)
    for i from 2 to length(A)
        key = A[i]
        j = i - 1

        while j > 0 and A[j] > key
            A[j+1] = A[j]
            j = j - 1
        end while

        A[j+1] = key
    end for
end function
```




