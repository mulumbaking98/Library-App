# TP_6
SEIS635 class Library project

This is a book library project. It implements all the features that a general book store has. It implements how the book is checked out to the patron and also how it's checked back in.

When a patron checks out a book, he is given 10 days until he returns the book. For each day that he doesn't return it, he is charged a late fee. if he has more late fees, then his account is put on hold by the manager.The holds can be cleared by the worker if the patron pays the fines he accumulated by having the book for a lot more days than he was supposed to do.

The log implementation of this program, keeps tabs of all the activities that go on in the program. 

This program was also unit tested and it has coverage of 76%. The Main method was simplified so the it only calls the it's constructor, since we didn't want it to be having a lot of functionalities inside itself.

The reverse engineered class diagram was created as well as an all test suite, for all the test cases.
