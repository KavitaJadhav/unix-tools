unix-tools
==========

WC
--------------

This will display number of lines,words and characters in specified file

`Example - jk_Wc.sh filename`


Head
--------------

This will display given number of lines specified file , if number of lines is optional if not given it will display top  10 lines in given file.

`Example - jk_Head.sh filename [noOfLines]`

TAIL
--------------

This will display given number of lines specified file , if number of lines is optional if not given it will display bottem  10 lines in given file.

`Example - jk_Tail.sh filename [noOfLines]`


UNIQ
--------------

This will reduce all redudent lines if same line present twice it will remove it.

`Example - jk_Uniq.sh filename `


SORT
--------------

This will give all lines in file aither in assending or desending order.
    order is optinal if not given it will sort in asending order
    
`Example - jk_Sort.sh filename [-r]`

CUT
--------------

This will specific field in String or file. you should give field number .
delimeter is optional . default delemeter is *space*
    
`Example - jk_Cut.sh filename -f2 [-d:]`
`Example - jk_Cut.sh data -f2 [-d:]`

REMOVESPACE
--------------

This will remove redudent spaces in file and write in destination file. 

`Example - jk_RemoveSpace.sh srcFilename destFilename`