// loading the file we want to apply test againist
load xor.hdl,

// altering the test file with some userful output
// determine the output file
output-file xor.out,
// determine the ouput variables
output-list a b out;
 
// the 4 tests
// whenever the simulator will see the directive output, it will write to the output file the current values predetermined by the output-list
set a 0, set b 0, eval, output;
set a 0, set b 1, eval, output;
set a 1, set b 0, eval, output;
set a 1, set b 1, eval, output;