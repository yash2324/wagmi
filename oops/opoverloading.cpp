#include <iostream> 
using namespace std; 
class Count {
private:int value; public:
Count() : value(5) {} void operator ++ () {
++value;

}
void display() {
cout << "Count: " << value << endl;

}
};



int main() { Count count1;

// Call the "void operator ++ ()" function
++count1;
 
count1.display(); return 0;
}

