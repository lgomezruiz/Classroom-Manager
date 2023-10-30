# Classroom-Manager

Program, using object-oriented programming (OOP), to create a classroom with students and a teacher, and determine if a class can be held, given certain conditions

# Output example

# Exercise Summary

We want to represent, with object-oriented programming, a classroom with students and a teacher.

The objective is to create a classroom of students and a teacher and determine if classes can be held, taking into account the aforementioned conditions.

NOTE: Data can be random (names, age, grades, etc.) as long as it makes sense (age cannot be 80 on a student or grade can be 12).

• For both students and teachers we need to know their name, age and gender. For the students, we also want to know their current grade (between 0 and 10) and the teacher who teaches the subject.

• The subjects available are mathematics, philosophy and physics.

• Students will have 50% of playing hooky, so if they play hooky they don't go to class but even if they don't go it will be recorded in the classroom (like everyone has their place).

• The teacher has a 20% chance of not being available (meetings, leave, etc.)

• The two previous operations must be called the same in Student and Teacher (polymorphism).

• The classroom must have a numerical identifier, the maximum number of students and what it is intended for (mathematics, philosophy or physics). Think about what more attributes you need.

• In order for a class to be taught, a classroom needs the teacher to be available, the teacher of the corresponding subject in the corresponding classroom (a philosophy teacher cannot teach in a mathematics classroom) and there must be more than 50% students.

• If you can teach class, show how many students (separately) are approved at the moment (imagine that they are being given the grades).
