package StreamAPI_Interview.Stream_100_API_Questions;

import java.util.Arrays;
import java.util.List;

public class Q_6_ConvertAllLetterstoUpperCase {
    List<String> words=Arrays.asList();
    
}

/*
Task:
- Convert a colon-separated list of file information into a clean, human-readable table.
- The raw data includes the full path, Unix numeric permissions, size, and other details.
- Basically, this is what you need to do (you can choose the order, except for the first one):
  - Parse this data.
  - Convert the numeric permissions into the rwx format.
  - Shorten the file paths.
  - Print the human-readable table.
- The paths must be as short as possible and only include the filename and as many parent directories as necessary to make each path unique.
- The final output should be a left-aligned, ASCII-formatted table with clear headers.
- Here is an example of the output for the above data.
Input:
projects/java/src/main/App.java ;  644;  2048;  2025-09-04T10:30:00Z;  application/java
projects/java/src/main/config.xml;  644 ;512;2025-09-04T11:00:00Z;application/xml
projects/python/scripts/utils.py;  755;1024;2025-09-04T11:30:00Z;application/x-python
projects/web/assets/styles.css;  644; 4096;2025-09-04T12:00:00Z;text/css
projects/web/assets/scripts/main.js; 755;2048;2025-09-04T12:30:00Z;application/javascript
personal/documents/resume.docx;600;8192;2025-09-04T13:00:00Z;application/vnd.openxmlformats-officedocument.wordprocessingml.document
work/reports/quarterly/2025_Q1.pdf;  644;16384;2025-09-04T13:30:00Z;application/pdf
work/reports/quarterly/2025_Q2.pdf;644  ;16384;2025-09-04T14:00:00Z;application/pdf
work/templates/report.docx;644 ;4096;2025-09-04T14:30:00Z;application/vnd.openxmlformats-officedocument.wordprocessingml.document
projects/java/lib/App.java;644 ;2048;2025-09-04T10:30:00Z;application/java
personal/pictures/2024_vacation/photo_1.jpg;644 ;32768;2025-09-04T15:00:00Z;image/jpeg
personal/pictures/2024_vacation/photo_2.jpg;644;24576;2025-09-04T15:30:00Z;image/jpeg
projects/java/test/App.java;644;2048;2025-09-04T10:30:00Z;application/java
projects/python/data/config.xml;644;512;2025-09-04T11:00:00Z;application/xml
projects/services/auth/auth/README.md;644;1024;2025-09-04T16:00:00Z;text/markdown
projects/microservices/auth/auth/README.md;644;1024;2025-09-04T16:00:00Z;text/markdown

Output:
Path                               User    Group    Other    Size (bytes)    Last Modified           File Type
main/App.java                      rw-     r--      r--      2048            2025-09-04T10:30:00Z    application/java
main/config.xml                    rw-     r--      r--      512             2025-09-04T11:00:00Z    application/xml
utils.py                           rwx     r-x      r-x      1024            2025-09-04T11:30:00Z    application/x-python
styles.css                         rw-     r--      r--      4096            2025-09-04T12:00:00Z    text/css
main.js                            rwx     r-x      r-x      2048            2025-04-06T12:30:00Z    application/javascript
resume.docx                        rw-     ---      ---      8192            2025-04-06T13:00:00Z    application/vnd.openxmlformats-officedocument.wordprocessingml.document
2025_Q1.pdf                        rw-     r--      r--      16384           2025-04-06T13:30:00Z    application/pdf
2025_Q2.pdf                        rw-     r--      r--      16384           2025-04-06T14:00:00Z    application/pdf
report.docx                        rw-     r--      r--      4096            2025-04-06T14:30:00Z    application/vnd.openxmlformats-officedocument.wordprocessingml.document
lib/App.java                       rw-     r--      r--      2048            2025-09-04T10:30:00Z    application/java
photo_1.jpg                        rw-     r--      r--      32768      2025-04-06T15:00:00Z    image/jpeg
photo_2.jpg                        rw-     r--      r--      24576           2025-04-06T15:30:00Z    image/jpeg
test/App.java                      rw-     r--      r--      2048            2025-09-04T10:30:00Z    application/java
data/config.xml                    rw-     r--      r--      512             2025-09-04T11:00:00Z    application/xml
services/auth/auth/README.md       rw-     r--      r--      1024            2025-04-06T16:00:00Z    text/markdown
microservices/auth/auth/README.md  rw-     r--      r--      1024            2025-04-06T16:00:00Z    text/markdown

*/