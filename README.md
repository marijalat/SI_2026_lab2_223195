# SI_2026_lab2_223195
Marija Latinovska
223195
Control Flow Graph
searchBookByTitle
<img width="347" height="1022" alt="Untitled Diagram drawio" src="https://github.com/user-attachments/assets/baede6c1-b179-4acf-b0a4-c214efe18be7" />

borrowBook

Фотографија од control flow graph-от за borrowBook

****ЦИКЛОМАТСКА КОМПЛЕКСНОСТ****
*searchBookByTitle
Функцијата содржи 3 одлучувачки точки:
проверка дали насловот е празен (title.isEmpty())
проверка дали книгата се совпаѓа и не е изнајмена
проверка дали резултатот е празен (results.isEmpty())
Цикломатска комплексност:
M = P + 1
P = 3
M = 3 + 1 = 4
Цикломатската комплексност за searchBookByTitle е 4

*borrowBook
Функцијата содржи 3 одлучувачки точки:
проверка за празен наслов или автор (title.isEmpty() || author.isEmpty())
проверка дали книгата се совпаѓа (наслов + автор)
проверка дали книгата е веќе изнајмена (!book.isBorrowed())
M = P + 1
P = 3
M = 3 + 1 = 4
Цикломатската комплексност за borrowBook е 4


TЕСТ СЛУЧАИ СПОРЕД EVERY STATEMENT
*searchBookByTitle
Тест	Влез	Очекуван резултат
Т1	валиден наслов	враќа листа со книги
Т2	непостоечки наслов	null
Т3	празен наслов	исклучок
 Минимален број тест случаи: 3

ТЕСТ СЛУЧАИ СПОРЕД EVERY BRANCH
*borrowBook
Тест	Гранка	Опис
Т1	success	книга успешно изнајмена
Т2	invalid input	празен наслов/автор
Т3	already borrowed	книга веќе изнајмена
Т4	not found	книга не постои
Минимален број тест случаи: 4

ТЕСТ СЛУЧАИ СПОРЕД MULTIPLE CONDITION
*title.isEmpty() || author.isEmpty()
Тест	title празен	author празен	резултат
T1	T	T	исклучок
T2	T	F	исклучок
T3	F	T	исклучок
T4	F	F	продолжува извршување
Минимален број тест случаи: 3
