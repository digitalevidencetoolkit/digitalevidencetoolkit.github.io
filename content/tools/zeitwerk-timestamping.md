---
title: "Zeitwerk — Trusted timestamps without the blockchain"
date: 2026-01-01
description: "Zeitwerk is a free, open-source timestamping service built on a coordinated federation of independent European operators, with no cryptocurrency dependency."
tags: ["timestamping", "open-source", "integrity", "evidence-preservation"]
---

In our constituencies, proving that a file existed exactly like this before a potential controversy is a requirement. _"I owned a copy of this file at this date,"_ I want to be able to say to a court.

**Timestamping is how you prove it — and as AI-generated content erodes baseline trust in digital media, it's becoming critical infrastructure for democracy. Today's options are inadequate: legal notaries are expensive and inaccessible, commercial services create vendor lock-in, and Bitcoin-based solutions tie essential infrastructure to an energy-intensive system with volatile governance.**

<style>
.zeitwerk-intro { display: flex; align-items: center; gap: 2rem; margin: 1.5rem 0; }
.zeitwerk-intro img { width: 50%; flex-shrink: 0; }
.zeitwerk-intro p { margin: 0; }
@media (max-width: 600px) {
  .zeitwerk-intro { flex-direction: column; gap: 1rem; }
  .zeitwerk-intro img { width: 80px; }
}
</style>

<div class="zeitwerk-intro">
  <img src="/images/logo-zeitwerk.png" alt="Zeitwerk logo" />
  <p><b>Zeitwerk</b> is a free, open-source timestamping service whose trust comes from a coordinated federation of independent 🇪🇺 European operators — with cross-witness transparency built in and no cryptocurrency dependency.</p>
</div>

---

#### How it works

```
You submit a hash          →    Witness A signs it
                           →    Witness B signs it
                           →    Witness C signs it
                                    ↓
                           Witnesses cross-verify
                           each other's checkpoints
                                    ↓
                         You receive a proof bundle
                         verifiable offline, forever
```

Proofs are self-contained. They don't expire, don't require Zeitwerk to keep existing, and don't need any blockchain to verify. A proof generated today will still be checkable in twenty years with nothing but the standalone verifier and the file it certifies.

---

### How it compares

| | **Self-hostable** | **No cryptocurrency** | **Federated trust** | **Free for public-interest use** |
|---|:---:|:---:|:---:|:---:|
| **Zeitwerk** | ✅ | ✅ | ✅ | ✅ |
| OpenTimestamps | ✅ | ❌ Bitcoin-dependent | ❌ | ✅ |
| eIDAS Qualified Timestamps | ❌ | ✅ | ❌ Centralised | ❌ Costly |
| OriginStamp, Chainpoint | ❌ Commercial | Varies | ❌ | ❌ |
| Certificate Transparency | ✅ | ✅ | ✅ | ✅ (but TLS-only) |

---

#### Who is it for?

Researchers · Archivists · Software maintainers · Journalists · Public institutions · Developers integrating timestamping into their tools

---

#### Status

Zeitwerk is in active development, funded by [Prototype Fund](https://prototypefund.de) (2026 cohort). The goal is a coordinated European federation: shared protocols, recruited institutional operators, and a sustainability plan independent of any single funder or company.

---

**Stay informed**

Reach out to `<hi@digitalevidencetoolkit.org>` or subscribe to our newsletter:

<iframe src="https://digitalevidencetoolkit.substack.com/embed" width="100%" height="320" style="border:0px solid #EEE; background:white;" frameborder="0" scrolling="no"></iframe>
