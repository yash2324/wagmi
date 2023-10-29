#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Student {
public:
    string name;
    string branch;
    int rollNo;
    char sex;
    float marks[5];

    void read() {
        cout << "Enter name: ";
        cin.ignore();
        getline(cin, name);
        cout << "Enter branch: ";
        getline(cin, branch);
        cout << "Enter roll number: ";
        cin >> rollNo;
        cout << "Enter sex (M/F): ";
        cin >> sex;
        cout << "Enter marks in 5 subjects: ";
        for (int i = 0; i < 5; i++) {
            cin >> marks[i];
        }
    }

    float calculatePercentage() {
        float totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            totalMarks += marks[i];
        }
        return (totalMarks / 5);
    }
};

int main() {
    int numStudents;
    cout << "Enter the number of students: ";
    cin >> numStudents;
    cin.ignore();
    
    vector<Student> students;  // Use a vector instead of an array

    for (int i = 0; i < numStudents; i++) {
        cout << "Enter details for Student " << i + 1 << ":\n";
        Student student;
        student.read();
        students.push_back(student);
    }

    cout << "Students with more than 70% marks:\n";
    for (int i = 0; i < numStudents; i++) {
        float percentage = students[i].calculatePercentage();
        if (percentage > 70) {
            cout << "Name: " << students[i].name << ", Percentage: " << percentage << "%" << endl;
        }
    }

    return 0;
}
