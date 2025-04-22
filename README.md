# Java Unit test & TDD øvelser
Øvelserne er lavet til at træne unit test og TDD (Test Driven Development) i Java.

## Opsætning i IntelliJ

### Opret en Test mappe

- Opret en ny mappe kaldet `test` på samme niveau som `src` i IntelliJ.
- Højre klik på mappen og vælg **Mark Directory As** → **Test Sources Root**.

### Tilføj JUnit som en dependency
- Højre klik på projektet → Open Module Settings
- Vælg `Modules` i venstre side
- Klik på `+` knappen og vælg `From Maven...`
- Indsæt `org.junit.jupiter:junit-jupiter:5.8.1` i feltet og klik **OK**.
- Klik **Apply** og **Ok** i vinduet der åbner sig.

## Fremgangsmåde
For **hver metode**, følg denne fremgangsmåde:

1. **Skriv en test først**
    - Test skal fejle (Red).
2. **Implementér den simpleste løsning**
    - Få testen til at gå igennem (Green).
3. **Refaktorér om nødvendigt**
    - Koden skal være pæn og læsbar (Refactor).

