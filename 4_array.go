package array

import "fmt"

func main(){

	name := [3]int{3,4,5}
	fmt.Println(name,"length",len(name)) 


	// append slices
	name := []int{3,4,5}
	name = append(name,67)
	fmt.Println(name,"size",len(name));	

	// slice range
	reange := names[1:2];
	reangeTwo := names[:2];
	reangeTwo := names[2:];
	fmt.Println(reange) //o/p = [4 5]
	
}