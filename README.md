# Handwriting Language Project

Inspired by Crafting Interpreters by Robert Nystrom (https://craftinginterpreters.com/), this is an experimental project where I'm creating a simple, code-based language designed to generate handwriting and fonts. The idea is to encode each character using drawing instructions - essentially programming your own font or even your personal handwriting style.

---

## 🎨 What This Language Does

- Treats letters as **drawing instructions**, not static shapes.
- Defines each letter using basic commands like:
  - Starting line
  - Ending line
  - Direction
  - Shape (line, curve, dot, etc.)
- Supports **custom fonts** and **randomization** for stylistic variation.

Example for a lowercase `i`:

```
LETTER i
  STROKE 3 2 down line
  DOT 4 4 center circle
END i
```

---

## 🚀 Project Goals

- Create a **domain-specific language (DSL)** for handwriting and font generation.
- Enable:
  - Programmable letters as stroke instructions.
  - Randomization for natural, human-like variation.
  - Export to SVG or similar graphic formats.
- Modular letter definitions - combine or inherit from other shapes.
  - LETTER d uses a
  - LETTER w uses v

---

## 📋 Planned Features

- [x] Basic token types and parser design (inspired by Crafting Interpreters).
- [ ] Complete parser and interpreter.
- [ ] Rendering backend (SVG or Canvas output).
- [ ] Randomization logic for stylistic variations.
- [ ] Support for:
  - Curves and arcs
  - Positioning (left, center, right)
  - Stroke thickness / style
- [ ] Letter composition (inherit/extend other letter definitions).
- [ ] Export as font files (future goal).

---

## ⚙️ How to Run

> ⚠️ **Not yet runnable** - project still in early development.

Once working:
1. Compile the project:
   ```
   javac *.java
   ```

2. Run:
   ```
   java HandwritingLangInterpreter
   ```

3. Provide your handwriting definition files via CLI or editor.

---

## 🖼️ Visual Examples

> (Visual examples will be added once rendering is implemented.)

---

## 📚 Inspiration

Inspired by the book [Crafting Interpreters](https://craftinginterpreters.com/), but designed to create programmable handwriting and fonts rather than a general-purpose language.

---

## 🤝 Contributions

This is currently a personal learning project, shared with one other person - Dwayne F.

---

## 📄 License

Educational and experimental - no formal license assigned yet.

---

## 🚧 Disclaimer

This project is **not production-ready**. It’s an experimental exploration of language design applied to digital handwriting.
