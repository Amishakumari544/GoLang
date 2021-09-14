package main

import "fmt"
// Notice that the type comes after the variable name.
func add(x int, y int) int {
	return x + y
}

func main() {
	fmt.Println(add(42, 13))
}

// When two or more consecutive named function parameters share a type, we can omit the type from all but the last.
package main

import "fmt"

func add(x, y int) int {
	return x + y
}

func main() {
	fmt.Println(add(42, 13))
}
