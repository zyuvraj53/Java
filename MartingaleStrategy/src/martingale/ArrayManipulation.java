package martingale;

public class ArrayManipulation {
	
	//Comments are made in javascript
	
	
	public void push() {
		/*This method adds items to the end of an array and changes the original array.

		let browsers = ['chrome', 'firefox', 'edge'];
		browsers.push('safari', 'opera mini');
		console.log(browsers); 
		// ["chrome", "firefox", "edge", "safari", "opera mini"]
		 * 
		 */
		
		//Equivalent is add() of ArrayList
	}
	
	public void pop() {
		/*This method removes the last item of an array and returns it.

		let browsers = ['chrome', 'firefox', 'edge'];
		browsers.pop(); // "edge"
		console.log(browsers); // ["chrome", "firefox"]
		*
		*/
		
		//Equivalent is remove(index) of ArrayList		
	}
	
	public void shift() {
		/*This method removes the first item of an array and returns it.

		let browsers = ['chrome', 'firefox', 'edge'];
		browsers.shift(); // "chrome"
		console.log(browsers); // ["firefox", "edge"]
		*
		*/
		
		//Equivalent to remove(index) of ArrayList
		
	}
	
	public void unshift() {
		/*This method adds an item(s) to the beginning of an array and changes the original array.

		let browsers = ['chrome', 'firefox', 'edge'];
		browsers.unshift('safari');
		console.log(browsers); //  ["safari", "chrome", "firefox", "edge"]
		*
		*/
		
		//Equivalent to the add(int index, Element e) of ArrayList
		
	}
	
	public void splice() {
		/*This method changes an array, by adding, removing and inserting elements.

		The syntax is:

		array.splice(index[, deleteCount, element1, ..., elementN])
		
		Index --> here is the starting point for removing elements in the array
		deleteCount --> is the number of elements to be deleted from that index
		element1, …, elementN --> is the element(s) to be added
		
		
		Removing items
		
		after running splice() , it returns the array with the item(s) removed and removes it from the original array.
		
		let colors = ['green', 'yellow', 'blue', 'purple'];
		colors.splice(0, 3);
		console.log(colors); // ["purple"]
		// deletes ["green", "yellow", "blue"]
		 * 
		 * 
		 * 
		NB: The deleteCount does not include the last index in range.
		If the second parameter is not declared, every element starting from the given index will be removed from the array:
		
		
		
		let colors = ['green', 'yellow', 'blue', 'purple'];
		colors.splice(3);
		console.log(colors); // ["green", "yellow", "blue"]
		// deletes ['purple']
		 * 
		 * 
		 * 
		In the next example we will remove 3 elements from the array and replace them with more items:
		
		let schedule = ['I', 'have', 'a', 'meeting', 'tomorrow'];
		// removes 4 first elements and replace them with another
		schedule.splice(0, 4, 'we', 'are', 'going', 'to', 'swim');
		console.log(schedule); 
		// ["we", "are", "going", "to", "swim", "tomorrow"]
		 * 
		 * 
		 * 
		Adding items
		
		To add items, we need to set the deleteCount to zero
		
		let schedule = ['I', 'have', 'a', 'meeting', 'with'];
		// adds 3 new elements to the array
		schedule.splice(5, 0, 'some', 'clients', 'tomorrow');
		console.log(schedule); 
		// ["I", "have", "a", "meeting", "with", "some", "clients", "tomorrow"]
				*/
		
	}
	
	public void slice() {
		/*This method is similar to splice() but very different. It returns subarrays instead of substrings.
		This method copies a given part of an array and returns that copied part as a new array. It does not change the original array.

		The syntax is:

		array.slice(start, end)
		
		
		
		Here’s a basic example:

		let numbers = [1, 2, 3, 4]
		numbers.slice(0, 3)
		// returns [1, 2, 3]
		console.log(numbers) // returns the original array
		
		
		The best way to use slice() is to assign it to a new variable.

		let message = 'congratulations'
		const abbrv = message.slice(0, 7) + 's!'; 
		console.log(abbrv) // returns "congrats!"
		*/
	}
}
