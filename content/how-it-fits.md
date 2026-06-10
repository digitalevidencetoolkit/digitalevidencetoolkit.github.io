---
title: "How it fits together"
description: "The Digital Evidence Preservation Toolkit is a research programme, not a single product. Each project is a self-contained building block — modular, independent, and designed to snap together."
menu: "main"
---

Part company, product, and consultancy – the Toolkit is an umbrella for my research: a (hopefully) coherent set of questions about how digital evidence gets made, broken, and made trustworthy again, with tools & demos built to answer those questions in practice.

Each project is independent — Zeitwerk is its own service, evidx.de its own product, the WordPress plugin its own codebase — but they share a baseplate of principles and design choices that make them snap together. From that shared problem, each tool is grounded in the practice of digital investigations, journalism and human rights documentation.

---

<style>
.lego-scene { margin: 2rem 0; border-radius: 6px; overflow: hidden; }
.lego-baseplate-top { background-color: #efefef; background-image: radial-gradient(circle, #aaa 1.5px, transparent 1.5px); background-size: 24px 24px; padding: 1.25rem 1.25rem 0.75rem; }
.lego-grid { display: grid; grid-template-columns: repeat(4, 1fr); gap: 8px; }
.brick { border-radius: 5px 5px 3px 3px; padding: 0.9rem 1rem 1rem; position: relative; color: #fff; min-height: 130px; display: flex; flex-direction: column; }
.brick-studs { display: flex; gap: 5px; margin-bottom: 0.75rem; }
.stud { width: 13px; height: 13px; border-radius: 50%; background: rgba(255,255,255,0.38); box-shadow: 0 2px 0 rgba(0,0,0,0.18), inset 0 1px 2px rgba(255,255,255,0.25); flex-shrink: 0; }
.brick-phase { font-size: 0.68rem; text-transform: uppercase; letter-spacing: 0.09em; opacity: 0.72; margin: 0 0 0.3rem; font-family: monospace; }
.brick-name { font-weight: 700; font-size: 1rem; margin: 0 0 0.35rem; color: #fff; line-height: 1.2; }
.brick-desc { font-size: 0.8rem; opacity: 0.88; line-height: 1.45; margin: 0; flex: 1; }
.brick-link { display: inline-block; margin-top: 0.6rem; font-size: 0.75rem; color: rgba(255,255,255,0.85); text-decoration: underline; text-underline-offset: 2px; }
.brick-link:hover { color: #fff; text-decoration: underline; }
.brick-blue { background: #2563EB; box-shadow: 0 5px 0 #1D4ED8, 2px 7px 12px rgba(0,0,0,0.2); grid-column: span 3; }
.brick-orange { background: #D97706; box-shadow: 0 5px 0 #B45309, 2px 7px 12px rgba(0,0,0,0.2); grid-column: span 1; }
.brick-red { background: #DC2626; box-shadow: 0 5px 0 #B91C1C, 2px 7px 12px rgba(0,0,0,0.2); grid-column: span 2; }
.brick-green { background: #16A34A; box-shadow: 0 5px 0 #15803D, 2px 7px 12px rgba(0,0,0,0.2); grid-column: span 2; }
.brick-purple { background: #7C3AED; box-shadow: 0 5px 0 #6D28D9, 2px 7px 12px rgba(0,0,0,0.2); grid-column: span 4; }
.brick-ghost { background: #f1f1f1; border: 2px dashed #b0b0b0; box-shadow: none; grid-column: span 4; color: #555; min-height: 70px; }
.brick-ghost.brick-ghost-half { grid-column: span 2; }
.brick-ghost .stud { background: rgba(0,0,0,0.14); box-shadow: none; }
.brick-ghost .brick-phase { color: #777; }
.brick-ghost .brick-name { color: #333; }
.brick-ghost .brick-desc { color: #555; }
.lego-baseplate-bottom { background-color: #afafaf; background-image: radial-gradient(circle, #959595 1.5px, transparent 1.5px); background-size: 24px 24px; padding: 1.25rem; }
.baseplate-inner { background: rgba(255,255,255,0.55); border-radius: 4px; padding: 1rem 1.25rem; }
.baseplate-inner h3 { margin: 0 0 0.75rem; font-size: 0.85rem; text-transform: uppercase; letter-spacing: 0.08em; color: #333; }
.principles { display: grid; grid-template-columns: repeat(2, 1fr); gap: 0.4rem 1.5rem; margin: 0; padding: 0; list-style: none; }
.principles li { font-size: 0.82rem; color: #333; padding: 0; line-height: 1.4; }
.principles li::marker { content: none; }
.workflow { display: flex; align-items: stretch; gap: 0; margin: 2rem 0; overflow-x: auto; -webkit-overflow-scrolling: touch; }
.workflow-step { flex: 1; min-width: 120px; padding: 0.9rem 0.75rem; background: #f4f4f4; border-left: 3px solid #ddd; font-size: 0.8rem; line-height: 1.4; }
.workflow-step:first-child { border-left: 3px solid #2563EB; border-radius: 3px 0 0 3px; }
.workflow-step-label { font-size: 0.65rem; text-transform: uppercase; letter-spacing: 0.08em; color: #888; margin-bottom: 0.3rem; font-family: monospace; }
.workflow-step-tool { font-weight: 600; color: #222; margin-bottom: 0.2rem; }
.workflow-step-desc { color: #555; }
.workflow-arrow { display: flex; align-items: center; padding: 0 0.2rem; color: #bbb; font-size: 1.1rem; flex-shrink: 0; }
@media (prefers-color-scheme: dark) {
  .baseplate-inner { background: rgba(0,0,0,0.35); }
  .baseplate-inner h3, .principles li { color: #ddd; }
  .workflow-step { background: #2a2a2a; border-left-color: #444; }
  .workflow-step-tool { color: #eee; }
  .workflow-step-desc { color: #aaa; }
  .workflow-step-label { color: #666; }
  .brick-ghost { background: #e4e4e4; border-color: #999; }
  .brick-ghost .brick-phase { color: #666; }
  .brick-ghost .brick-name { color: #222; }
  .brick-ghost .brick-desc { color: #444; }
}
@media (max-width: 600px) {
  .lego-grid { grid-template-columns: repeat(2, 1fr); }
  .brick-blue, .brick-orange, .brick-red, .brick-green, .brick-purple, .brick-ghost { grid-column: span 2; }
  .principles { grid-template-columns: 1fr; }
  .workflow { flex-direction: column; }
  .workflow-arrow { transform: rotate(90deg); align-self: flex-start; padding: 0.2rem 0.75rem; }
  .workflow-step { border-left: 3px solid #ddd; min-width: unset; }
  .workflow-step:first-child { border-left: 3px solid #2563EB; }
}
</style>

<div class="lego-scene">
<div class="lego-baseplate-top">
<div class="lego-grid">
<div class="brick brick-purple">
<div class="brick-studs"><span class="stud"></span><span class="stud"></span><span class="stud"></span><span class="stud"></span></div>
<div class="brick-phase">Research &amp; writing</div>
<div class="brick-name">Digital investigations research</div>
<div class="brick-desc">The questions the tools exist to answer: how digital evidence gets made, broken, and made trustworthy again. Grounded in fieldwork with newsrooms and human-rights teams, and research at Stanford — with findings shared as they develop in the newsletter.</div>
<a class="brick-link" href="/newsletter/">→ The newsletter</a>
</div>
<div class="brick brick-blue">
<div class="brick-studs"><span class="stud"></span><span class="stud"></span><span class="stud"></span><span class="stud"></span></div>
<div class="brick-phase">Capture &amp; Archive</div>
<div class="brick-name">evidx.de</div>
<div class="brick-desc">A browser extension that turns a single click into a tamper-evident, cryptographically verifiable web archive — WACZ format, full-page, chain-of-custody baked in. Built with Dot•Studio, deployed to pilot media partners.</div>
<a class="brick-link" href="https://evidx.de/?campaign=dept">→ evidx.de</a>
</div>
<div class="brick brick-orange">
<div class="brick-studs"><span class="stud"></span><span class="stud"></span></div>
<div class="brick-phase">Workflow</div>
<div class="brick-name">Raindrop → Browsertrix</div>
<div class="brick-desc">Turns a researcher's existing bookmarks into a forensic-quality archive. 9,000 URLs, 98 GiB, in production with Airwars.</div>
<a class="brick-link" href="/tools/raindrop-to-browsertrix/">→ Read more</a>
</div>
<div class="brick brick-red">
<div class="brick-studs"><span class="stud"></span><span class="stud"></span><span class="stud"></span></div>
<div class="brick-phase">Authenticate</div>
<div class="brick-name">Zeitwerk</div>
<div class="brick-desc">Trusted timestamps without blockchain or vendor lock-in. A federated European network of independent witnesses. Proofs stay verifiable for decades offline. Funded by Prototype Fund 2026.</div>
<a class="brick-link" href="/tools/zeitwerk-timestamping/">→ Read more</a>
</div>
<div class="brick brick-ghost brick-ghost-half">
<div class="brick-studs"><span class="stud"></span><span class="stud"></span></div>
<div class="brick-phase">Coming soon</div>
<div class="brick-name">WordPress Plugin</div>
<div class="brick-desc">Chain-of-custody tracking, C2PA Content Credentials, and court-ready exports baked into the CMS investigative teams already use.</div>
</div>
<div class="brick brick-ghost">
<div class="brick-studs"><span class="stud"></span><span class="stud"></span></div>
<div class="brick-phase">Coming soon</div>
<div class="brick-name">Microsoft Relativity Integration</div>
<div class="brick-desc">Bringing DEPT's verification and chain-of-custody features into the legal discovery platform used by law firms and courts worldwide.</div>
</div>
</div>
</div>
<div class="lego-baseplate-bottom">
<div class="baseplate-inner">
<h3>The baseplate — shared across everything</h3>
<ul class="principles">
<li>🔐 Cryptographic hashing (SHA-256, Merkle trees)</li>
<li>📋 Append-only, tamper-evident audit trails</li>
<li>🔗 Open, interoperable formats (WACZ, RFC 3161, C2PA)</li>
<li>🇪🇺 EU-grounded infrastructure, no US cloud dependency</li>
<li>🔓 Free and open-source at every layer</li>
<li>⚖️ Designed for legal admissibility from day one</li>
</ul>
</div>
</div>
</div>

---

If you're building something that touches any of these problems — or if you're in a newsroom or legal team trying to make your evidence practices more robust — I'd like to hear from you.

📧 [basile@digitalevidencetoolkit.org](mailto:basile@digitalevidencetoolkit.org)  
📞 `@basile.42` on Signal
