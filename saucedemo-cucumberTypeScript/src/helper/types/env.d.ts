declare global {
    namespace NodeJS{
          interface ProcessEnv {
            BROWSER: "chrome" | "firefox" | "webkit",
            BASEURL: string
        }
    }
}
export{}