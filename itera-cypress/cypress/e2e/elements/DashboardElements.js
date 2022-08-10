export default class DashboardElements {
  url = "https://itera-qa.azurewebsites.net/Dashboard";
  createNewBtn = "body > div > div > p:nth-child(4) > a";
  searchInput = "#searching";
  searchBtn = "body > div > div > form > input.btn.btn-secondary.my-2.my-sm-0";
  editBtn = "body > div > div > table > tbody > tr:nth-child(2) > td:nth-child(7) > a.btn.btn-outline-primary";
  deleteBtn = "body > div > div > table > tbody > tr:nth-child(2) > td:nth-child(7) > a.btn.btn-outline-danger";
  welcomeMsg = " body > div > div > h3 "

  noMatch = "body > div > div > table > tbody > tr:nth-child(2) > td";
  nomePesquisado = "body > div > div > table > tbody > tr:nth-child(2) > td:nth-child(1)";
  EmailPesquisado = "body > div > div > table > tbody > tr:nth-child(2) > td:nth-child(6)";
}