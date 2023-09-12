# M450

## Abstrakte Testfälle

| Testfall | Kaufpreis           | Rabattregel erwartet |
| -------- | ------------------- | -------------------- |
| 1        | < 15000             | Kein Rabatt          |
| 2        | >= 15000 & <= 20000 | 5% Rabatt            |
| 3        | >= 20000 & <= 25000 | 7% Rabatt            |
| 4        | > 25000             | 8.5% Rabatt          |

## Konkrete Testfälle

| Testfall | Kaufpreis | Rabattregel erwartet |
| -------- | --------- | -------------------- |
| 1        | 14000     | Kein Rabatt          |
| 2        | 16000     | 5% Rabatt            |
| 3        | 19500     | 5% Rabatt            |
| 4        | 20500     | 5% Rabatt            |
| 5        | 23000     | 7% Rabatt            |
| 6        | 24500     | 7% Rabatt            |
| 7        | 26000     | 8.5% Rabatt          |

## Testfall Testergebnis

| Anmeldung und Registrierung    |
| ------------------------------ |
| Suche nach verfügbaren Autos   |
| Buchung eines Autos            |
| Stornierung einer Buchung      |
| Zahlungsabwicklung             |
| Profilverwaltung               |
| Benachrichtigungen und E-Mails |
| Bewertung und Feedback         |
| Fahrzeugabholung und -rückgabe |
| Kundensupport                  |


