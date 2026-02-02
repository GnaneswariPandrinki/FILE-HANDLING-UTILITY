# FILE-HANDLING-UTILITY

COMPANY:CODETECH IT SOLUTIONS

NAME:PANDRINKI GNANESWARI

INTERN ID:CTIS2947

DOMAIN:JAVA PROGRAMMING

DURATION:4 WEEKS

MENTOR:NEELA SANTHOSH

DESCRIPTION:File Handling Utility in Java

 Project Overview

The File Handling Utility in Java is a console-based application designed to demonstrate basic file operations using Java. This project focuses on performing essential tasks such as writing data to a file, 

reading data from a file, and modifying (appending) data to an existing file. File handling is a fundamental concept in Java and plays an important role in real-world applications like data storage, logging 

systems, and configuration management.

This project uses Java’s built-in java.io package and does not require any external libraries, making it easy to understand and execute. It is especially suitable for students and beginners who want hands-on 

experience with Java file operations.

 Objectives

The objectives of this project are:

To understand file handling concepts in Java

To learn how to create, read, and modify text files

To implement proper exception handling

To write clean and modular Java code

To gain practical knowledge useful for real-world applications

 Technologies Used

Programming Language: Java

Package: java.io.*

IDE: VS Code / Eclipse / IntelliJ IDEA

File Type: Text file (.txt)

No additional dependencies are required.

 Project Structure
FileOperations.java
sample.txt
README.md


FileOperations.java contains all the logic for file operations

sample.txt is the file created and modified during execution

README.md provides project documentation

 Functional Description
Writing to a File

The writeToFile() method writes text content into a file using FileWriter and BufferedWriter. If the file already exists, its content is overwritten. If it does not exist, Java automatically creates the file.

Reading from a File

The readFromFile() method reads the file content line by line using FileReader and BufferedReader. Each line is displayed on the console, allowing users to view the stored data clearly.

Modifying a File

The modifyFile() method appends new content to the existing file by enabling append mode in FileWriter. This ensures that previous data is preserved while adding new information.

 Exception Handling

All file operations are enclosed within try-catch blocks to handle IOException. This prevents program crashes due to errors such as missing files or access issues and helps display meaningful error messages.

 Execution Flow

Writes initial data to the file

Reads and displays file content

Appends additional data

Reads and displays updated content

This flow clearly demonstrates how file operations work in sequence.

 Applications

Text data storage

Log file handling

Student record systems

Configuration file management

Learning base for advanced Java I/O

Conclusion

This File Handling Utility project provides a strong introduction to Java file operations. By using buffered streams, modular methods, and proper exception handling, the program follows good coding practices. It is an ideal project for beginners to understand how Java interacts with files and serves as a foundation for building more advanced file-based applications.
