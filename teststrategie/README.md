# M450

## Übung 1

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

## Übung 2
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


## Übung 3
<ul>
<li>Testfall 1: Kontobearbeitung

Beschreibung: Der Benutzer gibt eine gültige Kontonummer ein und wählt die Option zur Bearbeitung eines Kontos aus.

Erwartetes Ergebnis: Das System sollte dem Benutzer die Möglichkeit bieten, das ausgewählte Konto zu bearbeiten.

Testfall 2: Anzeigen aller Konten

Beschreibung: Der Benutzer gibt "a" ein, um alle Konten anzuzeigen.

Erwartetes Ergebnis: Das System sollte eine Liste aller Konten anzeigen.

Testfall 3: Kontoerstellung

Beschreibung: Der Benutzer gibt "e" ein, um ein neues Konto zu erstellen, und gibt die erforderlichen Informationen ein.

Erwartetes Ergebnis: Das System sollte das neue Konto erstellen und eine Bestätigung ausgeben.

Testfall 4: Wechselkursabfrage

Beschreibung: Der Benutzer gibt "w" ein, um den Wechselkurs abzufragen und gibt die gewünschten Währungen ein.
Erwartetes 

Ergebnis: Das System sollte den aktuellen Wechselkurs zwischen den angegebenen Währungen anzeigen.

Testfall 5: Beenden der Anwendung

Beschreibung: Der Benutzer gibt "q" ein, um die Anwendung zu beenden.

Erwartetes Ergebnis: Die Anwendung wird geschlossen.</li>
<li>Code Path Testing: Dies beinhaltet die Überprüfung verschiedener Code-Pfade, um sicherzustellen, dass alle möglichen Bedingungen und Abzweigungen abgedeckt sind, z.B. if-else-Anweisungen, Schleifen und Ausnahmefälle.

Statement Coverage: Diese Technik stellt sicher, dass jede Code-Anweisung mindestens einmal ausgeführt wird.

Branch Coverage: Hier wird überprüft, ob alle möglichen Zweige in Kontrollstrukturen wie if-else und switch-case-Anweisungen durchlaufen werden.

Path Coverage: Diese umfassendere Methode gewährleistet, dass alle möglichen Code-Pfade getestet werden, einschließlich verschiedener Kombinationen von Anweisungen und Bedingungen.

Mutation Testing: Diese fortgeschrittene Methode involviert künstliche Änderungen im Code, um sicherzustellen, dass die Tests fehlschlagen, wenn der Code geändert wird, um die Testeffektivität zu überprüfen.

Boundary Value Analysis: Diese Technik konzentriert sich auf Testfälle an den Limits zulässiger Werte, um sicherzustellen, dass die Randbedingungen korrekt behandelt werden.

Code Static Analysis Tools: Automatisierte Funktionen können verwendet werden, um potenzielle Probleme wie nicht initialisierte Variablen oder toten Code zu identifizieren.</li>
<li>Variablennamen: Aussagekräftigere Variablennamen wie userLastName anstelle von userNachname oder str anstelle von Eingabe, um die Lesbarkeit des Codes zu verbessern

Naming-Convention: camelCase für Variablennamen und PascalCase für Klassennamen. Beispielsweise sollte userLastName zu userNachname und Counter zu Schalter werden.

Comments: Mehr comments, um komplexe Logik zu erklären, insbesondere in der Counter-Klasse.

Ressourcenmanagement: Der Scanner (sc) und andere Ressourcen explizit schließen, wenn man fertig ist. ggf. in einem finally-Block

Exceptions: In der Methode getExchangeRate: Ausnahmen protokollieren oder eleganter behandeln, anstatt einfach 0.0 ohne Hinweis auf einen Fehler zurückzugeben.
</li>
</ul>