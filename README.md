# SI_2026_lab2_223195
Marija Latinovska
223195
Control Flow Graph
searchBookByTitle
<img width="347" height="1022" alt="Untitled Diagram drawio" src="https://github.com/user-attachments/assets/baede6c1-b179-4acf-b0a4-c214efe18be7" />

borrowBook

Фотографија од control flow graph-от за borrowBook

Cyclomatic Complexity

*searchBookByTitle
The function contains 3 decision points:
- title.isEmpty()
- title match and availability check
- results.isEmpty()

Cyclomatic complexity:
M = 3 + 1 = 4

*borrowBook
The function contains 3 decision points:
- empty title/author check
- title and author match
- borrowed status check

Cyclomatic complexity:
M = 3 + 1 = 4
