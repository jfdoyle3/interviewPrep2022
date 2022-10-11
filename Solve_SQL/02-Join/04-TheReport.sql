SELECT students.name,  grades.grade, students.marks
FROM students
JOIN grades ON (
                students.marks >= grades.min_mark
                AND
                students.marks <= grades.max_mark
                )

ORDER BY grades.grade DESC, students.name DESC
