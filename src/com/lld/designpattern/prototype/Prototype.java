package com.lld.designpattern.prototype;

public interface Prototype<T> {
    T clone();
}
// clone > getCopy
/* Student, Teacher, Notebook
* public interface StudentPrototype {
*   Student clone();
* }
*
* public interface TeacherPrototype {
*   Teacher clone();
* }
*
* public interface NoteBookPrototype {
*   NoteBook clone();
* }
*
*/