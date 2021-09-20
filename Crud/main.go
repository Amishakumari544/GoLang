package main

import (
	"encoding/json" //encode data into json
	"fmt"
	"log" //to logout errors
	"math/rand"
	"net/http" //create server
	"strconv"  //used for converting id(int) into string

	"github.com/gorilla/mux"
)

// no use of data base
// going to use structs - an object like key value pairs


type Pet struct{    //start with capital
		ID string `"json:id"`
		name string `json:name`
		problem string `json:problem`
		Client *Client `"json:client`    //* pointer

}

type Client struct{
		name string `"json:name"`
}


var pets []Pet
func getPets(w http.ResponseWriter, r *http.Request) { //passing the pointer when we send the respond it will be w 
	w.Header().Set("content-Type","application/json")  //to format json
	json.newEncoder(w).Encode(pets)
} 

func deletePet(w http.ResponseWriter, r *http.Request){
	w.Header().Set("content-Type","application/json")
	params := mux.vars(r)
	for index, item := range pets { //params = id which is inside mux.vars
		if item.ID == params["id"]{
		//delete pets using append 
			pets = append(pets[:index],pets[index+1:]...)
			break
			}                        
		}
		json.NewEncoder(w).Encode(pets) //return the updated json
	}
		// get Pet
func getPet(w http.ResponseWriter, r *http.Request){			
		w.Header().Set("content-Type","application/json")
		params := mux.Vars(r)
		for _,item := range pets{
			if item.ID == params["id"]{
				// return json item single item will be return
				json.newEncoder(w).Encode(item)
				return
			}
		}	
	}

func main(){
	r:=mux.newRouter()
	// creating some pets data in the starting to check when we hit the server at the start we want to check if it working to pets data or not [optional]
	pets = append(pets,Pet{ID:1,name:"kiddo",problem:"vomit",Client: &Client{name:"Amisha"}})  //to get address of the client to deferecing
	pets = append(pets,Pet{ID:2,name:"ayra",problem:"nothing",Client: &Client{name:"Steal"}})  //to get address of the client to deferecing
	pets = append(pets,Pet{ID:3,name:"Pluto",problem:"acne",Client: &Client{name:"Navya"}})

	r.handleFunc("/pets",getPets).Methods("GET")
	r.handleFunc("/pets{id}",getPet).Methods("GET")
	r.handleFunc("/pets",createPet).Methods("POST")
	r.handleFunc("/pets{id}",updatePet).Methods("PUT")
	r.handleFunc("/pets{id}",deletePet).Methods("DELETE")

	fmt.Println("Starting Port ")
	log.fatal(http.ListenAndServe(":3000",r))
}