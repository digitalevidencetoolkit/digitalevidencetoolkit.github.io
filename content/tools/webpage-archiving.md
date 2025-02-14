---
title: "Archive Webpages with Proof of Integrity"
date: 2024-06-01
---

The Digital Evidence Preservation Toolkit (DEPT) offers a seamless way to capture and authenticate web content while ensuring a verifiable chain of custody. Our one-click browser extension allows you to archive webpages with cryptographic proof, making them admissible in legal, journalistic, and research contexts.

Every saved webpage is stored alongside metadata, DNS records, and a tamper-proof ledger entry, ensuring long-term integrity. Whether you’re investigating misinformation, documenting critical online evidence, or preserving web pages for compliance, our solution guarantees authenticity you can trust.

![Untitled](/images/architecture.png)

---

#### Key Features:

- ✅ **One-Click Webpage Archiving** – Save full pages, screenshots, and metadata instantly.
- ✅ **Tamper-Proof Ledger** – Cryptographic proof of integrity and a verifiable chain of custody.
- ✅ **Secure Storage & Searchable Library** – Easily retrieve and annotate archived pages.
- ✅ **Exportable & Court-Ready** – Generate legally admissible digital records.

---

#### How It Works

Our browser extension (JavaScript & WebExtensions API) enables seamless webpage capture, storing screenshots and full-page HTML archives. These records are then processed by our Node.js & TypeScript backend, which verifies integrity using SHA-256 hashing and records transactions in a ledger database (AWS QLDB or alternative immutable storage).

The archived content is accessible through our SvelteKit-powered UI, which allows users to search, annotate, and export their saved records. Data can be securely stored locally or synced with an Amazon S3 bucket for long-term encrypted archiving.

API integrations with Microsoft Relativity, Strapi, Notion, and Uwazi may extend these capabilities, enabling legal professionals and researchers to integrate web evidence directly into their existing case management systems.

---

**Access the web archiving tools and stay informed**

Reach out to `<hi@digitalevidencetoolkit.org>` or subscribe to our newsletter:

<iframe src="https://digitalevidencetoolkit.substack.com/embed" width="100%" height="320" style="border:0px solid #EEE; background:white;" frameborder="0" scrolling="no"></iframe>
