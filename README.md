# ☕ ITS - Progetti Java (Eclipse Workspace)

Benvenuto in questa repository. Qui raccolgo tutti gli esercizi, i laboratori e i progetti sviluppati durante il corso ITS utilizzando il linguaggio **Java**.

Questa cartella funge da *Workspace* principale per Eclipse.

## 🛠 Tecnologie utilizzate
* **Linguaggio:** Java (JDK)
* **IDE:** Eclipse
* **Version Control:** Git & GitHub

## 📂 Struttura della Repository
La repository è organizzata come un *Monorepo*: ogni cartella all'interno (es. `HelloWorldTest`) rappresenta un singolo progetto Java indipendente.

> **Nota Tecnica:** La cartella `.metadata` generata da Eclipse è esclusa dal versionamento tramite `.gitignore` per mantenere la repository pulita e portabile su altri computer.

---

## 🚀 Guida Rapida: Come fare il Push
Questi sono i comandi da terminale per salvare il lavoro e caricarlo su GitHub ogni volta che finisco un esercizio.

### 1. Entra nella cartella (se non ci sei già)
```bash
cd ~/its_eclipse_java
```

### 2. Prepara i file (Stage)

Aggiunge tutte le modifiche (nuovi file o file modificati) alla "scatola" di invio.
```bash
git add .
```

### 3. Salva le modifiche (Commit)

Chiude la scatola con un'etichetta. Sostituisci il messaggio tra virgolette con una descrizione breve di cosa hai fatto.
```bash
git commit -m "Descrizione di cosa ho fatto oggi"
```

### 4. Spedisci online (Push)

Invia i commit locali al server GitHub.
```bash
git push
```

---

### Come caricarlo su GitHub subito

Una volta che hai creato e salvato il file `README.md` nella tua cartella, dobbiamo spedirlo su GitHub così vedrai la pagina principale formattata bene.

Apri il terminale ed esegui esattamente i comandi che hai appena scritto nella guida (è un ottimo test!):

```bash
cd ~/its_eclipse_java
git add .
git commit -m "Aggiunto file README con istruzioni"
git push
```

---

## 📝 Tutorial: Come creare un nuovo Esercizio
Segui questa procedura standard per ogni nuovo lavoro:

### 1. Crea il Progetto
1. Vai su **File** > **New** > **Java Project**.
2. Scegli un nome ordinato (es. `Esercizio02_Nome`).
3. ⚠️ **IMPORTANTE:** In basso, sotto "Module", **TOGLI LA SPUNTA** da `Create module-info.java`.
4. Clicca **Finish**.

### 2. Crea la Classe
1. Apri la cartella del nuovo progetto.
2. Tasto destro sulla cartella **src** > **New** > **Class**.
3. Nome classe: `Main`.
4. ✅ Metti la spunta su: `public static void main(String[] args)`.
5. Clicca **Finish**.

### 3. Salva su GitHub
A fine lavoro, apri il terminale (o usa quello di Eclipse) e dai questi comandi:

```bash
cd ~/its_eclipse_java
git add .
git commit -m "Aggiunto Esercizio XX"
git push