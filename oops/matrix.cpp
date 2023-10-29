#include <iostream> 
using namespace std;
void add(int m1[][10], int m2[][10], int m3[][10], int r, int c) {
for (int i = 0; i < r; i++) { for (int j = 0; j < c; j++) {
m3[i][j] = m1[i][j] + m2[i][j];

}
}
 
}
void subtract(int m1[][10], int m2[][10], int m3[][10], int r, int c) {
for (int i = 0; i < r; i++) { for (int j = 0; j < c; j++) {
m3[i][j] = m1[i][j] - m2[i][j];

}
}
}

void transpose(int m1[][10], int m2[][10], int r, int c) { for (int i = 0; i < r; i++) {
for (int j = 0; j < c; j++) { m2[j][i] = m1[i][j];
}
}
}

void multiply(int m1[][10], int m2[][10], int m3[][10], int r1, int c1, int c2) {
for (int i = 0; i < r1; i++) { for (int j = 0; j < c2; j++) {
 
for (int k = 0; k < c1; k++) { m3[i][j] += m1[i][k] * m2[k][j];
}
}
}
}

int main() {
int choice, r1, c1, r2, c2, i, j;
int m1[10][10], m2[10][10], m3[10][10];
do {
cout << "\nMenu:\n1. Add\n2. Subtract\n3.Transpose\n4. Multiply\n5. Exit\n"; 
cout << "Enter your choice: "; 
cin >> choice;
switch (choice) { case 1:
cout << "Enter the number of rows and columns of the first matrix: ";
cin >> r1 >> c1; 
 
cout << "Enter the elements of the first matrix:\n";

for (i = 0; i < r1; i++) { for (j = 0; j < c1; j++) {
cin >> m1[i][j];
 

}
}

cout << "Enter the number of rows and columns of the second matrix: ";
cin >> r2 >> c2;
cout << "Enter the elements of the second matrix: \n";
for (i = 0; i < r2; i++) { for (j = 0; j < c2; j++) {
cin >> m2[i][j];

}
}

if (r1 == r2 && c1 == c2) { add(m1, m2, m3, r1, c1);
cout << "The result of addition is: \n";
 
for (i = 0; i < r1; i++) { for (j = 0; j < c1; j++) {
cout << m3[i][j] << " ";

}
cout << "\n";
}

} else {
cout << "Addition not possible, matrices should have the same number of rows and columns\n";
}
break; case 2:
cout << "Enter the number of rows and columns of the first matrix: ";
cin >> r1 >> c1;
cout << "Enter the elements of the first matrix:\n";
 

 

for (i = 0; i < r1; i++) { for (j = 0; j < c1; j++) {
cin >> m1[i][j];
 
}
}

cout << "Enter the number of rows and columns of the second matrix: ";
cin >> r2 >> c2;
cout << "Enter the elements of the second matrix: \n";
for (i = 0; i < r2; i++) { for (j = 0; j < c2; j++) {
cin >> m2[i][j];

}
}

if (r1 == r2 && c1 == c2) { subtract(m1, m2, m3, r1, c1);
cout << "The result of subtraction is: \n"; for (i = 0; i < r1; i++) {
for (j = 0; j < c1; j++) { cout << m3[i][j] << " ";
}
cout << "\n";
 
}
} else {
cout << "Subtraction not possible, matrices should have the same number of rows and columns\n";
}
break; case 3:
cout << "Enter the number of rows and columns of the matrix: ";
cin >> r1 >> c1;
cout << "Enter the elements of the matrix:"; for (i = 0; i < r1; i++) {
for (j = 0; j < c1; j++) { cin >> m1[i][j];
}
}

transpose(m1, m3, r1, c1);
cout << "The result of transpose is: \n"; for (i = 0; i < c1; i++) {
for (j = 0; j < r1; j++) {
 
cout << m3[i][j] << " ";
}

cout << "\n";
}

break; case 4:
cout << "Enter the number of rows and columns of the first matrix: ";
cin >> r1 >> c1;
cout << "Enter the elements of the first matrix:\n";
 

 

for (i = 0; i < r1; i++) { for (j = 0; j < c1; j++) {
cin >> m1[i][j];
 

}
}

cout << "Enter the number of rows and columns of the second matrix: ";
cin >> r2 >> c2;
 
cout << "Enter the elements of the second matrix: \n";
for (i = 0; i < r2; i++) { for (j = 0; j < c2; j++) {
cin >> m2[i][j];

}
}

if (c1 == r2) {
for (i = 0; i < r1; i++) { for (j = 0; j < c2; j++) {
m3[i][j] = 0;

}
}

multiply(m1, m2, m3, r1, c1, c2);
cout <<"The result of multiplication is: \n"; for (i = 0; i < r1; i++) {
for (j = 0; j < c2; j++) { cout << m3[i][j] << " ";
}
cout << "\n";
 
}
} else {
cout << "Multiplication not possible, the number of columns of the first matrix should be equal to the number of rows of the second matrix\n";
}
break; case 5:
return 0; default:
cout << "Invalid choice\n";

}
} while (choice != 5); return 0;
}
