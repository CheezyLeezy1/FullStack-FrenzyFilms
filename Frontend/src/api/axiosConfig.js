import axios from "axios";

export default axios.create({
  baseURL: "https://e2f0-2001-bb6-1242-cf58-a5ac-a9c2-4c9d-25b1.eu.ngrok.io",
  headers: { "ngrok-skip-browser-warning": "true" },
});
