# Handwriting Language Project

Inspired by [Crafting Interpreters](https://craftinginterpreters.com/) by Robert Nystrom, this is an experimental project where I'm creating a simple, code-based language designed to generate handwriting and fonts. The idea is to encode each character using drawing instructions - essentially programming your own font or even your personal handwriting style.
###### *Why the name? There’s no “e” in my last name, but people often add one when writing or typing it. So the name means “No E Language” - with the capital E emphasizing both the missing letter and distinguishing it from the word “Noel.”*
---

## 🎨 What This Language Does

- Treats letters as **drawing instructions**, not static shapes.
- Defines each letter using basic commands like:
  - Starting line
  - Ending line
  - Direction
  - Shape (line, curve, dot, etc.)
- Supports **custom fonts** and **randomization** for stylistic variation.

V 0.0.2 Example for a lowercase `i`:  
Each letter has customizable width.  
Coordinates are relative to the letter’s box, where:  
    The x/y origin is at the middle of the box (.5 = 50%).  
    
All coordinates are ratios of the total height.  
Values like .5 represent percentages (e.g., .5 = 50%).  

```
settings {
  monospace = false         -- if true, ignores all custom symbol widths
  mono_width = 600          -- used only when monospace = true
  font_height = 1000        -- normalized height for export (e.g. FontForge)
  
  -- height proportions (ascender → descender = 100%)
  ascender = 0.33           -- middle to ascender
  baseline = 0.33           -- base to middle
  descender = 0.33          -- descender to base
}

letter i {
  width = 0.1               -- 10% of total height
  line iLine = 0.5, middle - 0.1, 0.5, baseline -- x,y , x,y
  dot  iDot  = 0.5, middle + 0.1
}
```

V 0.0.1 Example for a lowercase `i`:

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
