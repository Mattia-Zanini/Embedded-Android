# Storico Lezioni & Corrispondenza App Android Studio

Questo documento mappa i progetti e le applicazioni Android Studio presenti in questo repository alle lezioni del corso (con le relative date), basandosi sullo storico dei commit Git.

---

## Tabella Riassuntiva dei Progetti

| Progetto / Cartella | Lezione Associata | Data del Commit | Descrizione dell'Attività |
| :--- | :--- | :--- | :--- |
| [PrimaLezione](file:///Users/mattia/Documents/GitHub/Embedded-Android/PrimaLezione) | **Embedded 08** | 11 Mar 2026 | Prima lezione di laboratorio: installazione e configurazione di Android Studio. |
| [HelloWithButton](file:///Users/mattia/Documents/GitHub/Embedded-Android/HelloWithButton) | **Embedded 11** | 18 Mar 2026 | Seconda lezione: creazione e modifica di `HelloWithButton`. |
| [HelloWithButtonD](file:///Users/mattia/Documents/GitHub/Embedded-Android/HelloWithButtonD) | **Embedded 11** & **Embedded 14** | 18 Mar 2026 / 25 Mar 2026 | Creazione iniziale (18 Mar) e successive modifiche (25 Mar). |
| [HelloWithButtonC](file:///Users/mattia/Documents/GitHub/Embedded-Android/HelloWithButtonC) | **Embedded 14** | 25 Mar 2026 | Terza lezione: `HelloWithButton` con Jetpack Composable e inizio logging con Logcat. |
| [SwitchAcitivty_Intent](file:///Users/mattia/Documents/GitHub/Embedded-Android/SwitchAcitivty_Intent) | **Embedded 17** | 01 Apr 2026 | Analisi del ciclo di vita delle Activity (onCreate, onStart, etc.) tramite Logcat, lint check e navController. |
| [SecretMessage_start](file:///Users/mattia/Documents/GitHub/Embedded-Android/SecretMessage_start) | **Embedded 17** & **Embedded 19** | 01 Apr 2026 / 08 Apr 2026 | Creazione (01 Apr) e modifica per passare messaggi tramite Uri (08 Apr). |
| [RecyclerViewSimple](file:///Users/mattia/Documents/GitHub/Embedded-Android/RecyclerViewSimple) | **Embedded 19**, **Embedded 22** & **Embedded 25** (22 Apr)* | 08 Apr 2026 / 15 Apr 2026 / 22 Apr 2026 | Introduzione alla RecyclerView (08 Apr), esercizi 2 e 3 (15 Apr) e implementazione di una seconda Activity (22 Apr). |
| [SimpleCalcTest_start](file:///Users/mattia/Documents/GitHub/Embedded-Android/SimpleCalcTest_start) | **Embedded 28**, **Embedded 31** & **Embedded 34** | 29 Apr 2026 / 06 Mag 2026 / 13 Mag 2026 | Test unitari (29 Apr), test con Robolectric (06 Mag) e test strumentati con JUnit/Espresso (13 Mag). |
| [RoomWordsSample_start](file:///Users/mattia/Documents/GitHub/Embedded-Android/RoomWordsSample_start) | **Embedded 34** & **Embedded 35** | 13 Mag 2026 / 14 Mag 2026 | Introduzione a Room (13 Mag) e implementazione di Room, DAO e Repository (14 Mag). |
| [HelloWithButtonJNI](file:///Users/mattia/Documents/GitHub/Embedded-Android/HelloWithButtonJNI) | **Embedded 36** | 14 Giu 2026 | Introduzione a NDK con JNI e note su concorrenza e gestione processi. |

*\* Nota: La lezione del 22 Aprile non era inclusa esplicitamente nella lista iniziale delle lezioni (che saltava da Embedded 24 a Embedded 26), ma nel repository è presente un commit in quella data che corrisponde a mercoledì 22 Aprile (Embedded 25).*

---

## Cronologia Dettagliata dei Commit

### 1. 11 Marzo 2026 (Embedded 08)
* **Progetto:** [PrimaLezione](file:///Users/mattia/Documents/GitHub/Embedded-Android/PrimaLezione)
* **Commit:** `8a90f7f` - *"prima lezione, installazione e setting up di android studio"*
* **Attività:** Configurazione dell'IDE e creazione del primo progetto boilerplate.

### 2. 18 Marzo 2026 (Embedded 11)
* **Progetti:** [HelloWithButton](file:///Users/mattia/Documents/GitHub/Embedded-Android/HelloWithButton) & [HelloWithButtonD](file:///Users/mattia/Documents/GitHub/Embedded-Android/HelloWithButtonD)
* **Commit:** `150eee1` - *"seconda lezione, modifica degli hellowithbutton"*
* **Attività:** Prima implementazione dell'interfaccia con bottone e gestione dei click.

### 3. 25 Marzo 2026 (Embedded 14)
* **Progetti:** [HelloWithButtonC](file:///Users/mattia/Documents/GitHub/Embedded-Android/HelloWithButtonC) & [HelloWithButtonD](file:///Users/mattia/Documents/GitHub/Embedded-Android/HelloWithButtonD)
* **Commit:** `feb9461` - *"terza lezione, hellowithbutton con composable e inizio di logging con Logcat"*
* **Attività:** Introduzione a Jetpack Compose e utilizzo dei log di sistema.

### 4. 01 Aprile 2026 (Embedded 17)
* **Progetti:** [SecretMessage_start](file:///Users/mattia/Documents/GitHub/Embedded-Android/SecretMessage_start) & [SwitchAcitivty_Intent](file:///Users/mattia/Documents/GitHub/Embedded-Android/SwitchAcitivty_Intent)
* **Commit:** `bd789c1` (e duplicato `919eff5`) - *"visto come si comporta un'app con onCreate, onStart, onResume, etc.. utilizzando LogCat e visione dell'inspection code effettuato con i lint checks..."*
* **Attività:** Studio del ciclo di vita dei componenti Android, controlli di qualità del codice (lint) e primo passaggio di dati/navigazione.

### 5. 08 Aprile 2026 (Embedded 19)
* **Progetti:** [SecretMessage_start](file:///Users/mattia/Documents/GitHub/Embedded-Android/SecretMessage_start) & [RecyclerViewSimple](file:///Users/mattia/Documents/GitHub/Embedded-Android/RecyclerViewSimple)
* **Commit:** 
  * `eb175a0` - *"lezione 19 (generale) modificato SecretMessage passando il messaggio via Uri"*
  * `b45d2c9` - *"lezione 19 recclerview discusso un po' in classe"*
* **Attività:** Passaggio parametri avanzato tramite URI in Navigation Component e introduzione teorica/pratica alla RecyclerView.

### 6. 15 Aprile 2026 (Embedded 22)
* **Progetto:** [RecyclerViewSimple](file:///Users/mattia/Documents/GitHub/Embedded-Android/RecyclerViewSimple)
* **Commit:** `78e58c5` - *"lezione 22, recycler view esercizi 2 e 3 del file esercizi1.txt"*
* **Attività:** Svolgimento di esercizi pratici per popolare e gestire liste complesse in RecyclerView.

### 7. 22 Aprile 2026 (Embedded 25 - Mancante nella lista)
* **Progetto:** [RecyclerViewSimple](file:///Users/mattia/Documents/GitHub/Embedded-Android/RecyclerViewSimple)
* **Commit:** `18f4fe6` - *"es 1 del file esercizio2.txt -> seconda activity sul simplerecyclerview"*
* **Attività:** Collegamento tra più Activity e caricamento di dettagli da una RecyclerView a una nuova schermata.

### 8. 29 Aprile 2026 (Embedded 28)
* **Progetto:** [SimpleCalcTest_start](file:///Users/mattia/Documents/GitHub/Embedded-Android/SimpleCalcTest_start)
* **Commit:** `40604c3` - *"lezione 28: test unitari"*
* **Attività:** Introduzione ai test automatizzati in Android (Unit Tests locali con JUnit).

### 9. 06 Maggio 2026 (Embedded 31)
* **Progetto:** [SimpleCalcTest_start](file:///Users/mattia/Documents/GitHub/Embedded-Android/SimpleCalcTest_start)
* **Commit:** `42df76c` - *"lezione 31: test con roboelectric e cenario di activity"*
* **Attività:** Scrittura di test integrati con Robolectric per simulare il comportamento del framework Android senza un emulatore reale.

### 10. 13 Maggio 2026 (Embedded 34)
* **Progetti:** [SimpleCalcTest_start](file:///Users/mattia/Documents/GitHub/Embedded-Android/SimpleCalcTest_start) & [RoomWordsSample_start](file:///Users/mattia/Documents/GitHub/Embedded-Android/RoomWordsSample_start)
* **Commit:** `21e4bc9` - *"lezione 34: finiti i test con junit e fatti test con espresso -> test instrumented; inoltre iniziato l'esempio con Room"*
* **Attività:** Completamento dei test strumentati (Espresso) per la UI e avvio del progetto per la persistenza dei dati locali.

### 11. 14 Maggio 2026 (Embedded 35)
* **Progetto:** [RoomWordsSample_start](file:///Users/mattia/Documents/GitHub/Embedded-Android/RoomWordsSample_start)
* **Commit:** `b5fd4d8` - *"lezione 34, implementazione Room, Dao e Repository"*
* **Attività:** Implementazione del database locale SQLite con Room, definizione del Data Access Object (DAO) e del pattern Repository.

### 12. 14 Giugno 2026 (Embedded 36)
* **Progetto:** [HelloWithButtonJNI](file:///Users/mattia/Documents/GitHub/Embedded-Android/HelloWithButtonJNI)
* **Commit:** `fcdee7d` - *"introdotto NDK con JNI e note su concorrenza e processi"*
* **Attività:** Introduzione ad Android NDK/JNI (integrazione C++ via CMake), programmazione concorrente (Main Thread, worker threads, coroutine) e gestione del ciclo di vita dei processi.
